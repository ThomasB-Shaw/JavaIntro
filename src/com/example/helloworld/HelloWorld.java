package com.example.helloworld;

import java.text.NumberFormat;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        final byte monthsInYear = 12;
        final byte percent = 100;

        Scanner Scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = Scanner.nextInt();
        System.out.println("Principal = " + principal);

        System.out.print("Rate: ");
        double rate = Scanner.nextDouble();
        double monthlyRate = rate / percent / monthsInYear;
        System.out.println("Rate = " + monthlyRate);

        System.out.print("Number of Payments: ");
        byte years = Scanner.nextByte();
        int numberPayments = years * monthsInYear;
        System.out.println("Number of Payments = " + numberPayments);

        double mortgage = principal * ((rate*Math.pow(1+monthlyRate , numberPayments)/(Math.pow(1+monthlyRate, numberPayments))-1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Total Mortgage Payment: " + mortgageFormatted);
    }
}
