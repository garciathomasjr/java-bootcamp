package com.tgarcia.javabootcamp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("What is your favorite color? ");
        String color = scanner.nextLine();

        System.out.print("How many years have you worked in IT? ");
        int yearsInIt = scanner.nextInt();

        System.out.print("One more qustion, how old are you? ");
        int age = scanner.nextInt();

        int startingAge = age - yearsInIt;

        System.out.println("Hello " + name);
        System.out.println("Really?? " + color + " is my favorite color too.");
        System.out.println("Wow " + yearsInIt + " years is a long time.");
        System.out.println("You started IT around age " + startingAge + ".");
    }
}