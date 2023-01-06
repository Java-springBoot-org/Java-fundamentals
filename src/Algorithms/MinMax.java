package Algorithms;
//The algorithm performs n−1n - 1n−1 comparisons. It has the complexity O(n)O(n)O(n). It's impossible to reduce
// the complexity If we do not have more information
// about the elements of the array. This is because the maximum can be either the first element or the last one or any other.
public class MinMax {
    public static int findIndexOfMax(int[] numbers) {
        int index = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[index]) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        findIndexOfMax(new int[] {1, 5, 3, 2, 3}); // 1
        findIndexOfMax(new int[] {6, 8, 7, 9}); // 3
        findIndexOfMax(new int[] {99}); // 0, the algorithm processes single-element arrays as well
    }
}

