package com.tgarcia.javabootcamp;

import java.util.Scanner;

public class AgeClassifier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a test score: ");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid score.");
        }

              else if (score >= 95) {
                System.out.println("You earned an A!");
            }
              else if (score >= 85) {
                System.out.println("You earned a B!");
            }
              else if (score >= 75) {
                System.out.println("You earned a C.");
            }
              else if (score >= 65) {
                  System.out.println("You earned a D.");
        }
              else {
                System.out.println("You earned an F :(");
            }
    }
}