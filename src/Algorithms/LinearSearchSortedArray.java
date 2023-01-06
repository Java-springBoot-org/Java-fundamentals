package Algorithms;

//searchInSortedArray(new int[] {8, 15, 19, 20, 21}, 10); // -1, the element 10 is not found
public class LinearSearchSortedArray {

    //method to searchForAnArrayKey
    public static int searchInSortedArray(int[] arr, int searchedKey) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchedKey) {
                index = i;
                break;
            } else if (arr[i] > searchedKey) {
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(searchInSortedArray(new int[] {8, 15, 19, 20, 21}, 1));
        // -1, the element 10 is not found because the array is sorted and the key is bigger than the first element

        System.out.println(searchInSortedArray(new int[] {8, 15, 19, 20, 21}, 10));
        //-1, the element 10 is not found in the array

        System.out.println(searchInSortedArray(new int[] {8, 15, 19, 20, 21}, 19));
        //return index at 19 which is index 2 since 19 is available
    }
}
