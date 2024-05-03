package hw12_bookparser;

import java.io.*;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CreateStatistic {
    private static final Path DIRECTORY_PATH = Path.of("src/hw12_bookparser/statistic");

    //Method for creating statistics file and writing in it
    public static File writeStatistic(String bookTitle, Map<String, Integer> map, Set<String> set) {
        Path path = Path.of(DIRECTORY_PATH + "/" + bookTitle + "_statistic.txt");
        File statisticFile = path.toFile();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(statisticFile))){
            map = map.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .limit(10)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                            (oldValue, newValue) -> oldValue, HashMap::new));

            writer.write("Top 10 words:\n");
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                writer.write(entry.getKey() + " - " + entry.getValue() + " times\n");
            }
            writer.write("Total amount of unique words: " + set.size());
        }
        catch (IOException e) {
            System.err.println("Unable to create statistic.");
        }
        return statisticFile;
    }

    //Method for reading from statistics file
    public static void readStatistic(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        } catch (IOException e) {
            System.err.println("Unable to read statistic file.");
        }
    }
}
