package Algorithms;

public class MinMaxIntegerArray {
    public static int findMaxInteger(int[] numbers) {
        int index = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > numbers[index] ) {
                index = i;
            }
        }
        return  index;
    }
    public static void main(String[] args) {
        findMaxInteger(new int[] {1, 5, 3, 2, 3}); // 1
    }
    }
