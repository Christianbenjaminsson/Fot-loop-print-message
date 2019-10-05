package com.example.forloopprintmessage;

import java.util.Scanner;

public class ForLoopPrintMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("This program print hava a nice day");
        System.out.println("How many times do you want to print message: ");
        int input = scan.nextInt();

        for(int i = 1; i <=input; i++) {
            System.out.println("Have a nice day");
        }
    }
}
