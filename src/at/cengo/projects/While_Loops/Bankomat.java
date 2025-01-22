package at.cengo.projects.While_Loops;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        int balance = 0;
        boolean isFinished = false;
        int kontostand = 0;
        Scanner scanner = new Scanner(System.in);




        while (!isFinished){
            System.out.println("1.Einzahlen");
            System.out.println("2.Abheben");
            System.out.println("3.Kontostand");
            System.out.println("4.Beenden");
            int Selection = scanner.nextInt();

            if (Selection == 1){
                System.out.println("Wie viel möchten Sie einzahlen?");
                int einzahlen = scanner.nextInt();
                kontostand = kontostand + einzahlen;
            }

            if (Selection == 2){
                System.out.println("Wie viel möchten Sie abheben?");
                int einzahlen = scanner.nextInt();
                kontostand = kontostand - einzahlen;
            }


            if (Selection == 3){
                System.out.println(kontostand);

            }

            if (Selection == 4){

                System.out.println("Vorgang beendet");
                isFinished = true;
            }

        }
    }
}
