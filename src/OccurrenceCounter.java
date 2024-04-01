import java.util.List;

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
    public static void main(String[] args){
        List<String> wordsList = List.of("java", "python", "javascript", "ruby", "java", "c++", "python", "java", "javascript", "java");
        String targetWord = "java";

        int occurrences = countOccurrence(wordsList, targetWord);
        System.out.println("The word '" + targetWord + "' occurs " + occurrences + " times in the list.");
    }

}
