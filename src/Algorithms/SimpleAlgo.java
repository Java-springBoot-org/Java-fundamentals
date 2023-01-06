package Algorithms;
//The following algorithm finds an index of the maximum number in an array of ints.

public class SimpleAlgo {
    public static int findIndexOfMax(int[] numbers) {
        int index = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[index]) {
                index = i;
            }
            //It may be better to return the special value -1 to mean that no maximum was found in the array.
            // Let's add the special condition in the method:
            if (numbers.length == 0) {
                return -1;
            }
        }
        return index;

    }

    public static void main(String[] args) {

        int [] numbers = {10,20,30, 234, 40,50,60,70,80};
        System.out.println(numbers[findIndexOfMax(numbers)]);
        System.out.println(findIndexOfMax(new int[] {1, 5, 3, 2, 3})) ; // 1);
        System.out.println(findIndexOfMax(new int[] {6, 8, 7, 9})); // 3;
        System.out.println( findIndexOfMax(new int[] {99})); // 0, the algorithm processes single-element arrays as well
    }
}
