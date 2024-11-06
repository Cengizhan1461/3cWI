package at.cengo.projects.Strings;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.lang.String.valueOf;



public class woerterRaten {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] words = {"Hans", "pencil", "apple"};

        int randomNum = random.nextInt(words.length);
        String word = words[randomNum].toLowerCase();  // Convert to lowercase for easier matching
        char[] wordArr = word.toCharArray();
        char[] guessedArr = new char[wordArr.length];

        // Fill the guessed array with '*'
        for (int i = 0; i < guessedArr.length; i++) {
            guessedArr[i] = '*';
        }

        boolean isFinished = false;

        System.out.println("Willkommen zum Wort-Raten-Spiel!");

        // Main game loop
        while (!isFinished) {
            // Show the current guessed state
            printArray(guessedArr);

            // Get user input
            System.out.print("Welcher Buchstabe könnte im gesuchten Wort stecken? ");
            char guess = scanner.nextLine().toLowerCase().charAt(0);

            // Check if the guessed letter is in the word
            boolean found = false;
            for (int i = 0; i < wordArr.length; i++) {
                if (wordArr[i] == guess) {
                    guessedArr[i] = guess;
                    found = true;
                }
            }

            // Inform the user if the letter was found
            if (found) {
                System.out.println("Richtig! Der Buchstabe " + guess + " ist im Wort.");
            } else {
                System.out.println("Leider falsch! Der Buchstabe " + guess + " ist nicht im Wort.");
            }

            // Check if the word is fully guessed
            isFinished = isWordGuessed(guessedArr);

            if (isFinished) {
                System.out.println("Herzlichen Glückwunsch! Du hast das Wort richtig erraten: " + word);
            }
        }
    }

    // Utility method to check if the word is fully guessed
    private static boolean isWordGuessed(char[] guessedArr) {
        for (char c : guessedArr) {
            if (c == '*') {
                return false;
            }
        }
        return true;
    }

    // Utility method to print the current guessed state of the word
    private static void printArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c);
        }
        System.out.println();
    }
}