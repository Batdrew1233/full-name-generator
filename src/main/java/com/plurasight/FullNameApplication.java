package com.plurasight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Please enter your name");
        System.out.println("First Name: ");
        String firstName = myScanner.nextLine();
        System.out.println("Middle Name: ");
        String middleName = myScanner.nextLine();
        System.out.println("Last Name: ");
        String lastName = myScanner.nextLine();
        System.out.println("Suffix: ");
        String suffix = myScanner.nextLine();


    }
}
