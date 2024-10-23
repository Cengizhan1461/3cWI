package Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class string_Helper {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;


        while(!isFinished){
            System.out.println("1. Palindrome");
            System.out.println("2. Countletters");
            System.out.println("3. Reverse String");
            System.out.println("4. Print amount of letters");
            int selection = scanner.nextInt();

            if (selection == 1){
                String word = scanner.next();
                System.out.println(isPalindrome(word));


            }else if(selection == 2){
                String word = scanner.next();
                System.out.println(countletter(word));

            }else if (selection == 3){
                String word = scanner.next();

                System.out.println(reverseString(word));

                }else if(selection == 4){
                String word = scanner.next();

                System.out.println(printAmountOfLetters(word));
            }


            }


            }

    //isPalindrome
    public static boolean isPalindrome(String word){

        String rvsWord = "";
        char ch;
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            rvsWord = ch + rvsWord;
        }

        if(rvsWord.equals(word)){
            return true;
        }else{
            return false;
        }

    }

    //countletters
    public static int countletter (String word){


        return word.length();
    }



    //reverseString
    public static String reverseString(String word) {
        String rvsWord = "";
        char ch;
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            rvsWord = ch + rvsWord;
        }
        return rvsWord;
    }


        //printAmountofLetters
        public static String printAmountOfLetters (String word){

            List<Character> letters = new ArrayList<>();
            List<Integer> counts = new ArrayList<>();



            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                int index = letters.indexOf(ch);

                if (index != -1) {
                    counts.set(index, counts.get(index) + 1);
                } else {
                    letters.add(ch);
                    counts.add(1);
                }
            }

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < letters.size(); i++) {
                result.append(letters.get(i)).append(": ").append(counts.get(i)).append(", \n");
            }

// System.out.println(counts);
            return result.toString();

        }


    }



