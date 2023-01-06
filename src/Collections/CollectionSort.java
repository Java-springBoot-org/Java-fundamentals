package Collections;
//The sort method uses the merge sort algorithm to sort the collection, which is a divide-and-conquer algorithm that has a time complexity of O(n*log(n)). The merge sort algorithm is stable, which means that the relative order of equal elements is preserved during the sort.
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class CollectionSort {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 3, 7, 5, 2, 8);
        Collections.sort(numbers);
        System.out.println(numbers); // [2, 3, 5, 7, 8, 10]
    }
}
