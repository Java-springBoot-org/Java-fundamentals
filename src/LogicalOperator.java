import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /* Write a program that reads three numbers and checks that they all are different, i.e. not equal to one
        another.The output should be true or false.*/
        // put your code here
        int num1;
        int num2;
        int num3;

        System.out.println("Enter 3 integer numbers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        boolean valid = num1 != num2 && num2 != num3 && num1 != num3;
        System.out.println(valid);
    }
}