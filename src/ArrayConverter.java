import java.util.ArrayList;
import java.util.List;

public class ArrayConverter {
    public static <T> List<T> toList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array){
            list.add(element);
        }
        return list;
    }

    public static void main(String[] args){
        Integer[] intArray = {5, 2, 9, 1, 12};
        List<Integer> intList = toList(intArray);
        System.out.println("Array: " + java.util.Arrays.toString(intArray));
        System.out.println("List: " + intList);
    }
}
