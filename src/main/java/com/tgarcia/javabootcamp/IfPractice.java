package com.tgarcia.javabootcamp;

import java.util.Scanner;

public class IfPractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        if (age >= 65) {
            System.out.println("Retirement age.");
        }
        else if (age >= 21) {
            System.out.println("Adult.");
        }
        else {
            System.out.println("Minor.");
        }

    }
}