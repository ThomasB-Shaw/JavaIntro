package com.example.helloworld;

import java.text.NumberFormat;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        final byte monthsInYear = 12;
        final byte percent = 100;

        Scanner pScanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = pScanner.nextInt();
        System.out.println("Principal = " + principal);

        Scanner rScanner = new Scanner(System.in);
        System.out.print("Rate: ");
        double rate = rScanner.nextDouble();
        double monthlyRate = rate / percent / monthsInYear;
        System.out.println("Rate = " + monthlyRate);

        Scanner nScanner = new Scanner(System.in);
        System.out.print("Number of Payments: ");
        int numberPayments = nScanner.nextInt();
        System.out.println("Number of Payments = " + numberPayments);

        double mortgage = principal * ((rate*Math.pow(1+monthlyRate , numberPayments)/(Math.pow(1+monthlyRate, numberPayments))-1));
        System.out.println("Total Mortgage Payment: " + mortgage);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Total Mortgage Payment: " + mortgageFormatted);
    }
}
