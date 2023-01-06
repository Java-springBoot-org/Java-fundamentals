package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

//complexity of O(n) as the worst case but a constant if the first value of array equal  to the searched key
public class LinearSearchUnsortedArray {

    //this demonstrates index of the first occurrence with a break
    public static int search(int[] array, int valueToBeSearched) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToBeSearched) {
                index = i;
                //the break will stop once the first occurrence of a searched key is equal to the array value at that index;
                break;
            }
        }
        //return -1 if valueToBeSearched is n ot in the array
        return index;
    }

    // Implement a method to search the index of the last occurrence of a given value in an input array of int's.
    //If the value is not found, the method must return -1.


    public static int searchIndexOfLastOccurrence(int[] numbers, int value) {
        // write your code here
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                index = i;
            }
        }
        return index;
    }



    //Given a non-negative integer n, find a number r such that r * r = n and round down to the nearest integer.
    //Can you implement this without using the built-in square root?
    /* Example 1

Input

n = 9

Output

3

Explanation

3 is the square root of 9.
Example 2

Input

n = 26

Output

5

Explanation

~5.09901951359 is the square root of 26 and rounding down gives us 5.
*/
    public int solve(int n) {
        int r = -1;
        for(int i = 0; i < n; i++){
            if(i * i == n){
                r = i;
                break;
            }else if (i * i > n  ){
                break;
            }
            r++;
        }
        return r;
    }



    public static void main(String[] args) {
        int[] numbers = {1, 4, 7, 2, 3, 5};

        System.out.println(search(numbers, 1)); // 0
        System.out.println(search(numbers, 2)); // 3
        System.out.println( search(numbers, 3)); // 4
        System.out.println(search(numbers, 4)); // 1
        System.out.println(search(numbers, 5)); // 5
        System.out.println(search(numbers, 6)); // -1


        //test for last occurrence of the integer
        final Scanner scanner = new Scanner(System.in);
        final int[] arrayNumbers;
        final int k;
        if (scanner.hasNextInt()) {
            arrayNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            k = Integer.parseInt(scanner.nextLine());
        } else {
            arrayNumbers = new int[0];
            k = 10;
        }
        System.out.println(searchIndexOfLastOccurrence(arrayNumbers, k));
        //example an input of arrays like {1,23,45,45,56,45,56,45,45}, 45 where the last 45 value is at index 7

    }

}
