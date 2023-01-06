import java.util.Arrays;

public class Array {
    public static  void main(String[] args) {
//        The equals() method is used to determine if two arrays are equal to each
//other. It returns true if the arrays are equal and false if they are not.
        int[] arr1 = {0,2,4,6,8,10};
        int[] arr2 = {0,2,4,6,8,10};
        int[] arr3 = {10,8,6,4,2,0};
        boolean result1 = Arrays.equals(arr1, arr2); //true
        boolean result2 = Arrays.equals(arr1, arr3); //false


//        The copyOfRange() method allows you to copy the contents of one array into
//another. It requires three arguments. the original array, the starting index of the range (inclusive), and the ending index of the range (exclusive).
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = Arrays.copyOfRange(original, 1, 4);
        System.out.println(Arrays.toString(copy)); // [2, 3, 4]

//         toString method of the Arrays class is a utility method that returns a string representation of an array. The toString method takes an array as an argument and returns a string containing the elements of the array separated by commas and enclosed in square brackets.
        int[] numbers = {1, 2, 3, 4, 5};
        String str = Arrays.toString(numbers);
        System.out.println(str); // [1, 2, 3, 4, 5]

//        sort() method allows us to sort our arrays.
        int [] numbers2 = {12, 1, 5, -2, 16, 14};
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2)); //[-2, 1, 5, 12, 14, 16]



    }
}

class Person {


    ////        ToString returns a string representation of an object. T
//        The toString method is often overridden in subclasses to provide a more meaningful string representation of the object. For example, a Person class might override the toString method to return a string containing the person's name and age.
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + " years old)";
    }
}

class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        System.out.println(person); // Alice (30 years old)
    }
}
