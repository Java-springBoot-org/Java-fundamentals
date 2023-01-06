import java.util.Scanner;

public class Strings { /*public static void main(Strings[] args){

    }*/
    public static void main(String[] args) {
        String text = "The simple text string";
        String upperText = text.toUpperCase();
        //* replace all space characters with empty strings *//*
        System.out.println(upperText.replace(" ", ""));
        //this will print "THESIMPLETEXTSTRING"

        String shortString = "str";
        int number = 100;
        String result2 = number + 50 + shortString; // what is the result2?
        System.out.println(result2);

        //input a string to check if Prefix starts with J
        String word;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  a word ");
        word = scanner.nextLine();
        String wordIgnoreCase = word.toUpperCase();

        if (wordIgnoreCase.startsWith("J")){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        //a second way to using boolean
        String word1;
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Enter  a word ");
        word1 = scannerInput.nextLine();
        String wordIgnoreCase1 = word1.toUpperCase();
        boolean startWithJ = wordIgnoreCase1.startsWith("J");
        System.out.println(startWithJ);

        //endsWith burg
        // put your code here
        String word3;
        Scanner scannerInput1 = new Scanner(System.in);
        System.out.println("Enter  a word ");
        word3 = scannerInput1.nextLine();
        //String wordIgnoreCase1 = word1.toUpperCase();
        boolean endsWithBurg = word3.endsWith("burg");
        System.out.println(endsWithBurg);

        /*Write a program that reads a string and two integer numbers. These two numbers are representing a range that
        includes them both. Print the substring enclosed in this range.Both numbers are always greater than or equal
        to 0 and less than the string length.*/
        String textInput;
        int num1, num2;
        System.out.println("Enter  a word ");
        textInput = scanner.nextLine();
        System.out.println("Enter  num1 ");
        num1 = scanner.nextInt();
        System.out.println("Enter  num2 ");
        num2 = scanner.nextInt();
        if (num1 >= 0 && num2 >= 0  && num1 < textInput.length() && num2 < textInput.length()){
            System.out.println(textInput.substring(num1, num2 + 1));
        }
    }
}
