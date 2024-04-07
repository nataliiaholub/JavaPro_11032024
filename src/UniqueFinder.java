import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueFinder {

    public static List<Integer> findUnique(List<Integer> numberList){

        Set<Integer> uniqueSet = new HashSet<>(numberList);

        return new ArrayList<>(uniqueSet);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 4, 5, 2);
        List<Integer> uniqueNumbers = findUnique(numbers);

        System.out.println("Original list: " + numbers);
        System.out.println("Unique list: " + uniqueNumbers);
    }
}
