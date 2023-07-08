package com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner scanner = new Scanner(System.in);
    void getUserFirstName(){
        Pattern pattern = Pattern.compile("[A-Z]+[a-zA-Z]{2,}[0-9]*$");
        System.out.println("Enter The First Name : ");
        String firstName = scanner.nextLine();

        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()){
            System.out.println("First Name Is Valid.\n");
            getUserLastName();
        }else {
            System.out.println("First Name Is InValid.");
            getUserFirstName();
        }
    }
    void getUserLastName(){
        Pattern pattern = Pattern.compile("[A-Z]+[a-zA-Z]{2,}[0-9]*$");
        System.out.print("Enter The Last Name : ");
        String firstName = scanner.nextLine();

        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()){
            System.out.print("Last Name Is Valid.\n");
        }else {
            System.out.println("Last Name Is InValid.");
            getUserLastName();
        }
    }
}
