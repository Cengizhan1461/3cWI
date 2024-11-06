package at.cengo.projects.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.lang.String.valueOf;



public class woerterRaten {
    public static void main(String[] args) {
        String[] word = {"Hans", "pencil", "apple", "river", "mountain", "guitar", "chocolate", "sunflower", "computer", "ocean", "dream", "book", "elephant", "moon", "keyboard", "coffee", "rainbow", "forest", "camera", "butterfly", "zebra", "clock", "flower", "cloud"};


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;
        int randomNum = word.length;
        List<String> foundLetters = new ArrayList<>();
        for (int i = 0; i < word[randomNum].length(); i++) {
            System.out.println("_ ");
        }

        System.out.println();

        while (!isFinished) {

            String selectedLetter = scanner.next();

            if (containsLetter(word[randomNum], selectedLetter)) {
                foundLetters.add(selectedLetter);
            }
            printHiddenWord(word[randomNum], foundLetters);
        }
    }


    public static boolean containsLetter(String word, String letter) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter.charAt(0)) {
                return true;
            }
        }
        return false;
    }


    public static void printHiddenWord(String word, List<String> foundLetters) {
        for (int i = 0; i < word.length(); i++) {
            String currentLetter = String.valueOf(word.charAt(i));
            if (foundLetters.contains(currentLetter)) {
                System.out.print(currentLetter);
            } else {
                System.out.print("_");
            }

            System.out.print(" ");

        }
    }


}
