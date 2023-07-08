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
        String lastName = scanner.nextLine();

        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()){
            System.out.println("Last Name Is Valid.\n");
            getUserEmailID();
        }else {
            System.out.println("Last Name Is InValid.");
            getUserLastName();
        }
    }
    void getUserEmailID(){
        Pattern pattern = Pattern.compile("[a-z0-9]{3,}.[a-z0-9]{3,}@{1}(abc|bl|co){1}.co.in");
        System.out.println("Follow the format (abc123.xyz789@(abc or bl or co).co.in)");
        System.out.print("Enter The Email ID : ");
        String emailID  = scanner.nextLine();

        Matcher matcher = pattern.matcher(emailID);
        if (matcher.matches()){
            System.out.print("Email ID Is Valid.\n");
            getUserPhoneNumber();
        }else {
            System.out.println("Email ID Is InValid.");
            getUserEmailID();
        }
    }
    void getUserPhoneNumber(){
        Pattern pattern = Pattern.compile("91{1}[6-9]{1}\\d{9}");
        System.out.println("Follow the format (91XXXXXXXXXX)");
        System.out.print("Enter The Phone Number : ");
        String phoneNumber = scanner.nextLine();

        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches()){
            System.out.println("Phone Number ID Is Valid.\n");
        }else {
            System.out.println("Phone Number Is InValid.");
            getUserPhoneNumber();
        }
    }
}
