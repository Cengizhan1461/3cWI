package at.cengo.projects.Strings;

import java.util.Scanner;

public class CaesarVerschlüsselung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isFinished = false;
        while(!isFinished){

                String word = scanner.next();

            String result = encrypt(word);
            System.out.print(result);
            break;
        }

    }


    public static String encrypt(String word) {
        char[] wordAsArray = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            char newChar =  (char) (wordAsArray[i] + 2);
            if (newChar>122){
                int distance = newChar - 122;

                System.out.println("problem");
            }
            System.out.print(newChar);
        }
        return String.valueOf(wordAsArray);
    }
}
