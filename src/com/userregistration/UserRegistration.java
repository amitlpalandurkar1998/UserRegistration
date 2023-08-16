package com.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner scanner = new Scanner(System.in);

    Validator nameValidator = (input) -> Pattern.matches("[A-Z]+[a-zA-Z]{2,}[0-9]*$", input);
    Validator emailValidator = (input) -> Pattern.matches("^([a-z0-9_.+-]+@[a-z0-9-]+\\.[a-z0-9-.]{2,})$", input);
    Validator phoneValidator = (input) -> Pattern.matches("91{1}[6-9]{1}\\d{9}", input);
    Validator passwordValidator = (input) -> Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$", input);

    void validateInput(String prompt, Validator validator, String errorMessage) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        if (validator.validate(input)) {
            System.out.println("Valid.\n");
        } else {
            System.out.println("Error: " + errorMessage);
        }
    }

    void getUserFirstName() {
        validateInput("Enter The First Name : ", nameValidator, "Invalid First Name.");
        getUserLastName();
    }

    void getUserLastName() {
        validateInput("Enter The Last Name : ", nameValidator, "Invalid Last Name.");
        getUserEmailID();
    }

    void getUserEmailID() {
        System.out.println("Follow the format (abc@yahoo.com)");
        validateInput("Enter The Email ID : ", emailValidator, "Invalid Email ID.");
        getUserPhoneNumber();
    }

    void getUserPhoneNumber() {
        System.out.println("Follow the format (91XXXXXXXXXX)");
        validateInput("Enter The Phone Number : ", phoneValidator, "Invalid Phone Number.");
        getUserPassword();
    }

    void getUserPassword() {
        System.out.println("Follow the format (Minimum 8 characters)");
        validateInput("Enter the Password : ", passwordValidator, "Invalid Password.");
        exit();
    }

    void exit() {
        System.out.println("Thank you......");
    }
}
