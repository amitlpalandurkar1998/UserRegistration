package com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner scanner = new Scanner(System.in);
    void getUserFirstName(){
        Pattern pattern = Pattern.compile("[A-Z]+[a-zA-Z]{2,}[0-9]*$");
        System.out.print("Enter The First Name : ");
        String firstName = scanner.nextLine();

        try {
            Matcher matcher = pattern.matcher(firstName);
            if (matcher.matches()){
                System.out.println("First Name Is Valid.\n");
                getUserLastName();
            }else {
                throw new Exception("Invalid First Name.");
            }
        }catch (Exception m){
            System.out.println("Error: "+m.getMessage());
        }

    }
    void getUserLastName(){
        Pattern pattern = Pattern.compile("[A-Z]+[a-zA-Z]{2,}[0-9]*$");
        System.out.print("Enter The Last Name : ");
        String lastName = scanner.nextLine();

        try {
            Matcher matcher = pattern.matcher(lastName);
            if (matcher.matches()){
                System.out.println("Last Name Is Valid.\n");
                getUserEmailID();
            }else {
                throw new Exception("InValid Last Name.");
            }
        }catch (Exception m){
            System.out.println("Error: "+m.getMessage());
        }
    }
    void getUserEmailID(){
        Pattern pattern = Pattern.compile("^([a-z0-9_.+-]+@[a-z0-9-]+\\.[a-z0-9-.]{2,})$");
        System.out.println("Follow the format (abc@yahoo.com)");
        System.out.print("Enter The Email ID : ");
        String emailID  = scanner.nextLine();

        try {
            Matcher matcher = pattern.matcher(emailID);
                if (matcher.matches()){
                    System.out.println("Email ID Is Valid.\n");
                    getUserPhoneNumber();
                }else {
                    throw new Exception("Invalid Email ID.");
                }
            }catch (Exception m){
                System.out.println("Error: "+m.getMessage());
            }
    }
    void getUserPhoneNumber(){
        Pattern pattern = Pattern.compile("91{1}[6-9]{1}\\d{9}");
        System.out.println("Follow the format (91XXXXXXXXXX)");
        System.out.print("Enter The Phone Number : ");
        String phoneNumber = scanner.nextLine();

        try {
            Matcher matcher = pattern.matcher(phoneNumber);
            if (matcher.matches()){
                System.out.println("Phone Number Is Valid.\n");
                getUserPassword();
            }else {
                throw new Exception("Invalid Phone Number.");
            }
        }catch (Exception m){
            System.out.println("Error: "+m.getMessage());
        }
    }
    void getUserPassword(){
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$");
        System.out.println("Follow the format (Minimum 8 characters)");
        System.out.print("Enter the Password : ");
        String password = scanner.nextLine();

        try {
            Matcher matcher = pattern.matcher(password);
            if (matcher.matches()){
                System.out.println("Password Is Valid.\n");
                exit();
            }else {
                throw new Exception("Invalid Password.");
            }
        }catch (Exception m){
            System.out.println("Error: "+m.getMessage());
        }

    }
    void exit(){
        System.out.println("Thank you......");
    }

}
