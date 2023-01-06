package Sort;

import java.util.Arrays;

public class Sort {

    public static void sort(String[] names) {
        // use a local variable instead of a parameter for the length of the array
        int n = names.length;
        while (n > 1) {
            for (int j = 0; j < n - 1; j++) {
                // use the compareTo method of the String class to compare the strings
                if (names[j].compareTo(names[j + 1]) > 0) {
                    // use a temporary variable of the appropriate type to store the value being swapped
                    String tmp = names[j + 1];
                    names[j + 1] = names[j];
                    names[j] = tmp;
                }
            }
            n--;
        }
    }

    public static void main(String[] args) {
        String[] actualNames = new String[] {
                "Alamin", "Hassan", "Jamal", "Coline", "Mary", "Timothy"
        };
        sort(actualNames);
        // use the Arrays.toString method to print the array
        System.out.println(Arrays.toString(actualNames));
    }
}

