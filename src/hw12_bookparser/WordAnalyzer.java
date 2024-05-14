package hw12_bookparser;

import java.util.*;
import java.util.stream.Collectors;

public class WordAnalyzer {
    // Returns a map, containing the word and the number of occurrences of it
    public static Map<String, Integer> findWordCounts(List<String> list) {
        return list.stream()
                .collect(Collectors.toMap(word -> word.toLowerCase(), word -> 1, Integer::sum));
    }

    // Returns unique words
    public static Set<String> findUniqueWords(List<String> list){
        return new HashSet<>(list);
    }
}

