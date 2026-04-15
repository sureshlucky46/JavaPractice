package com.javaintro;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();

        int intValue = (int)d;
        float floatValue = (float) d;
        long longValue = (long) d;
  
        System.out.println("Original double value: " + d);
        System.out.println("Converted to int: " + intValue);
        System.out.println("Converted to float: " + floatValue);
        System.out.println("Converted to long: " + longValue);

        sc.close();
    }
}