package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FirstName {

    public static void main(String[] args) {
        FirstName user = new FirstName();
        System.out.println("Regex");
        user.firstNameCheck();
    }

    public void firstNameCheck(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Valid First Name: " );
        String  fName = s.next();
        boolean check = Pattern.matches("^[A-Z][a-zA-Z]{2,}$", fName);
        if (check)
            System.out.println("Correct-First Name is Validated");
        else
            System.out.println("Incorrect First Name");
    }
}