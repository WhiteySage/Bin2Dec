package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a binary number:");
        Scanner input = new Scanner(System.in);
        String binaryValue = input.next();
        System.out.println("Output:" + Integer.parseInt(binaryValue, 2));
    }
}
