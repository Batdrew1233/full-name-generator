package com.plurasight;


import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        System.out.print("First Name: ");
        String firstName = myScanner.nextLine();
        String finalFirstName = firstName.trim().substring(0, 1).toUpperCase() + firstName.substring(1);

        System.out.print("Middle Name: ");
        String middleName = myScanner.nextLine();
        String finalMiddleName = middleName.trim();


        System.out.print("Last Name: ");
        String lastName = myScanner.nextLine();
        String finalLastName = lastName.trim().substring(0, 1).toUpperCase() + lastName.substring(1);


        System.out.print("Suffix: ");
        String suffix = myScanner.nextLine();
        String finalSuffix = suffix.trim();


        String fullName = finalFirstName + " " + finalLastName;

        if (!finalMiddleName.isEmpty()) {
            fullName = finalFirstName + " " +finalMiddleName.substring(0, 1).toUpperCase() +". " + finalLastName + ", " + finalSuffix;
            if (finalSuffix.isEmpty()) {
                fullName = finalFirstName + " " + finalLastName;
            }
        }
        System.out.println(fullName);
        myScanner.close();

    }


    }
