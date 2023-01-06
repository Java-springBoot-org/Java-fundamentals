package Algorithms;

public class SortedSearch {
    public static int searchInSortedArray(int[] array, int value) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                break;
            } else if (array[i] > value) {
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int result = searchInSortedArray(new int[] {8, 15, 19, 20, 21}, 10); // -1, the element 10 is not found
        System.out.println(result);
    }
}
//complexity of O(n)