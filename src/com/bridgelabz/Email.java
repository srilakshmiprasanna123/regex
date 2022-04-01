package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Email {

    static String regexNamePattern="^[A-Z][a-zA-Z]{2,}$";
    static String regexEmailPattern="^[A-Za-z+_.-]+@[A-Za-z.-]+$";
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");
        firstNameCheck();
        secondNameCheck();
        emailCheck();
    }

    private static void emailCheck() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Valid Email-ID: " );
        String  mail = s.next();
        boolean check = Pattern.matches(regexEmailPattern, mail);
        if (check)
            System.out.println("Email-ID is Validated");
        else
            System.out.println("Incorrect Email-ID,Try Again");

    }

    private static void secondNameCheck() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Valid Last Name: " );
        String  lName = s.next();
        boolean check = Pattern.matches(regexNamePattern, lName);
        if (check)
            System.out.println("Last Name is Validated");
        else
            System.out.println("Incorrect Last Name,Try Again");
    }

    private static void firstNameCheck(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Valid First Name: " );
        String  fName = s.next();
        boolean check = Pattern.matches(regexNamePattern, fName);
        if (check)
            System.out.println("First Name is Validated");
        else
            System.out.println("Incorrect First Name, Try Again");

    }
}