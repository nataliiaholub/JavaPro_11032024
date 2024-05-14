package hw12_bookparser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BookAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the book title: ");
        String bookTitle = scanner.nextLine();
        analyzeBook(bookTitle);
    }

    private static void analyzeBook(String bookTitle) {
        //Methods for reading the book content
        String bookContent = " ";
        try {
            bookContent = BookReader.getBookContent(bookTitle);
        } catch (FileNotFoundException e) {
            System.out.println("File not found. The book with this title does not exist.");
            System.exit(1);
        } catch (IOException e) {
            System.out.println("I/O error. Not possible to read file.");
            System.exit(1);
        }
        List<String> allWords = BookReader.splitBookToWords(bookContent);

        // Methods for getting the number each word occurs and total amount of words
        Map<String, Integer> wordCounts = WordAnalyzer.findWordCounts(allWords);
        Set<String> uniqueWords = WordAnalyzer.findUniqueWords(allWords);

        // Methods to write statistic in file and to read it from the file
        File statisticFile = CreateStatistic.writeStatistic(bookTitle, wordCounts, uniqueWords);
        CreateStatistic.readStatistic(statisticFile);
    }
}
