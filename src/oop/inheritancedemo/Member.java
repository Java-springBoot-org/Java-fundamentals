package oop.inheritancedemo;

import java.util.Scanner;

public class Member {
    public String welcome = "Welcome to ABC Fitness";
    protected double annualFee;
    private String name;
    private int memberID;
    private int memberSince;
    private int discount;

    public Member() {
        System.out.println("Parent Constructor with no parameter");
    }

    //    3 private fields
    public Member(String pName, int pMemberID, int pMemberSince) {
        System.out.println("Parent Constructor with 3 parameters");
        name = pName;
        memberID = pMemberID;
        memberSince = pMemberSince;
    }

//    add a getter and setter method for the private field discount so that
//other classes can access this field.

    public double getDiscount() {
        return discount;
    }

    //    how a setter method can be used to prevent unauthorised access
//to a private field.
    public void setDiscount() {
        Scanner input = new Scanner(System.in);
        String password;
        System.out.print("Please enter the admin password: ");
        password = input.nextLine();
        if (!password.equals("abcd")) {
            System.out.println("Invalid password. You do not have authority to edit the discount.");
        } else {
            System.out.print("Please enter the discount: ");
            discount = input.nextInt();
        }
    }

    public void displayMemInfo() {
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberID);
        System.out.println("Member Since " + memberSince);
        System.out.println("Annual Fee: " + annualFee);
    }

    public void calculateAnnualFee() {
        annualFee = 0;
    }

}
