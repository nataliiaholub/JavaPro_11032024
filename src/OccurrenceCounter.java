import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccurrenceCounter {
    public static int countOccurrence(List<String> stringList, String targetString){
        int count = 0;
        for (String word : stringList){
            if (word.equals(targetString)){
                count++;
            }
        }
        return count;
    }

    public static void calcOccurrence(List<String> stringList){
        Map<String,Integer> occurrences = new HashMap<>();
        for (String word : stringList){
            occurrences.put(word, occurrences.getOrDefault(word, 0) +1);
        }
        for (Map.Entry<String, Integer> entry : occurrences.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

    public static List<Map<String, Object>> findOccurrence(List<String> stringList) {
        List<Map<String, Object>> result = new ArrayList<>();
        Map<String, Integer> occurrences = new HashMap<>();
        for (String word : stringList){
            occurrences.put(word, occurrences.getOrDefault(word, 0) +1);
        }
        for (Map.Entry<String, Integer> entry : occurrences.entrySet()){
            Map<String, Object> wordOccurrence = new HashMap<>();
            wordOccurrence.put("name", entry.getKey());
            wordOccurrence.put("occurrence", entry.getValue());
            result.add(wordOccurrence);
        }
        return result;
    }


    public static void main(String[] args){
        List<String> wordsList = List.of("java", "python", "javascript", "ruby", "java", "c++", "python", "java", "javascript", "java");
        String targetWord = "java";

        //countOccurrence method
        int occurrences = countOccurrence(wordsList, targetWord);
        System.out.println("Count occurrence method: ");
        System.out.println("The word '" + targetWord + "' occurs " + occurrences + " times in the list.");

        //calcOccurrence method
        System.out.println("Calc occurrence method: ");
        calcOccurrence(wordsList);

        //findOccurrence method
        System.out.println("Find occurrence method: ");
        List<Map<String, Object>> occurrencesList = findOccurrence(wordsList);
        for (Map<String, Object> occurrence : occurrencesList){
            System.out.println("{name: " + occurrence.get("name") + ", occurrence: " + occurrence.get("occurrence") + "}");
        }


    }

}
