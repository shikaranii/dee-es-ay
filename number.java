/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eramis.java;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author srberamis
 */

public class EramisJava {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(50) + 1;
        int attempts = 0;

        try (Scanner scannernishika = new Scanner(System.in)) {
            System.out.println("Number Guessing Game");
            System.out.println("Try to guess the selected number from 1 to 100");
            
            while (true) {
                int userguess = scannernishika.nextInt();
                attempts++;
                
                if (userguess == randomNumber) {
                    System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly in " + attempts + " attempts.");
                    break;
                } else if (userguess < randomNumber) {
                    System.out.println("Higher");
                } else {
                    System.out.println("Lower");
                }
            }
        }
    }
}
