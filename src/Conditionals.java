//the leap year problem
import java.lang.reflect.Array;
import java.util.*;

public class Conditionals {
    /*Find whether the given year is a leap year.
    Just a reminder: leap years are those years in which the year’s number is either divisible by 4, but not
    divisible by 100, or divisible by 400 (for example, the year 2000 is a leap year, but the year 2100 will not be a leap year).
    The program should work correctly for the years 1900 ≤ n ≤ 3000.
    Output "Leap" (case-sensitive) if the given year is a leap year, and "Regular" otherwise.
    It is enough to write a simple conditional statement to solve this task.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.println("Enter a year");
        year = scanner.nextInt();


        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            //false||true;//true because the program executes the brackets first then executes the later
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }


        //Given a four-digit number. Determine whether its decimal notation is symmetric.
        // If the number is symmetric, output 1; otherwise output any other integer.
        int symmetricalNumber;
        System.out.println("Enter a Symmetrical number for example 2020 or 2112 ");
        symmetricalNumber = scanner.nextInt();

        //convert int to String
        String yearString = Integer.toString(symmetricalNumber);
        int firstTwoNumbers = yearString.charAt(0) + yearString.charAt(1);
        int lastTwoNumbers  = yearString.charAt(2) + yearString.charAt(3);
        if (firstTwoNumbers == lastTwoNumbers) {
            System.out.println("yes "+ symmetricalNumber + " is a symmetrical Number" );
        } else {
            double randomNumber = Math.random() * 100;
            //convert double to integer using (int) (doubleValue)
            System.out.println((int) Math.floor(randomNumber));
            //System.out.println(Math.abs(randomNumber));
            System.out.println("no "+ symmetricalNumber + " is not symmetrical Number" );

        }

        //or another way is Splitting the String
        int number = scanner.nextInt();
        String stringNumber = String.valueOf(number);

        //also instead of charAt() we could use a substring(index 1, index 2 + 1) and substring(index 3, index 4 + 1) then compare them
        if (stringNumber.charAt(0) == stringNumber.charAt(3) && stringNumber.charAt(1) == stringNumber.charAt(2)) {
            System.out.println(1);
        } else  {
            System.out.println(2);
        }
    }
}
