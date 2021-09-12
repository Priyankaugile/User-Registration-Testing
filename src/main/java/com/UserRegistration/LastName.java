package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = scan.nextLine();
        System.out.println("Enter last name");
        String lastName = scan.nextLine();

        validateFirstName(firstName);
        validateLastName(lastName);
    }

    public static boolean validateLastName(String lastName) {
        String regex = "^[A-Z][a-z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        System.out.println("is valid: " +matcher.matches());
        return matcher.matches();
    }

    public static boolean validateFirstName(String firstName) {
        String regex = "^[A-Z][a-z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        System.out.println("is valid: " +matcher.matches());
        return matcher.matches();
    }
}
