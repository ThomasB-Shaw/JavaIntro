package com.example.helloworld;

import java.text.NumberFormat;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Constants
        final byte monthsInYear = 12;
        final byte percent = 100;

        // Global Variable
        int principal = 0;
        double monthlyRate = 0;
        int numberPayments = 0;

        // Global Scanner used to get user input
        Scanner scanner = new Scanner(System.in);

        // Principal input with while statement to ensure valid integer
        while(true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if(principal >= 1)
                break;
            System.out.println("Please enter a valid integer above 0");
        }

        // Rate input with while statement to ensure valid double input
        while(true) {
            System.out.print("Rate: ");
            double rate = scanner.nextDouble();
            monthlyRate = rate / percent / monthsInYear;
            if(rate > 1 && rate < 30)
                break;
            System.out.println("Please enter a rate between 1% and 30%");
        }

        // Payment# input with while statement to prevent invalid by input
        while(true) {
            System.out.print("Number of Payments: ");
            byte years = scanner.nextByte();
            numberPayments = years * monthsInYear;
            if(years < 50 )
                break;
            System.out.println("Please enter a valid integer less than 50");
        }

        // Equation to get the cost of monthly mortgage
        double mortgage = principal * (monthlyRate * Math.pow(1 + monthlyRate , numberPayments)/(Math.pow(1 + monthlyRate, numberPayments) - 1));

        // Formats the above equation to be readable to user
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Total Mortgage Payment: " + mortgageFormatted);
    }
}
