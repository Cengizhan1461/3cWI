package While_Loops;

import java.util.Random;
import java.util.Scanner;

public class Würfelbeispiel {
    public static void main(String[] args) {
        //Erstelle ein Würfelspiel! Du spielst gegen den Computer.
        // Wenn das Spiel startet (mit einem kleinen Menü), hat der Spieler 6 Würfe.
        // Er spielt dabei gegen den Computer.
        // Wenn die Augensumme höher ist als jene des
        // Computers hat der Spieler gewonnen, ansonsten der Computer.


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean isFinished = false;




        while (!isFinished) {
            System.out.println("Willkommen zum Würfelspiel!");
            System.out.println("1: Spiel Starten");
            int auswahl = scanner.nextInt();

            if (auswahl == 1) {
                int spielerSumme = 0;
                int computerSumme = 0;

                for (int i = 0; i < 6; i++) {
                    System.out.println("Drücken Enter zum Würfeln (Wurf " + i + "): ");
                    scanner.nextLine();
                    int wurf = random.nextInt(6) + 1;
                    spielerSumme = spielerSumme + wurf;
                    System.out.println(spielerSumme);
                    System.out.println("Sie haben eine " + wurf + " gewürfelt.");
                }


                System.out.println("Ihr Gesamtergebnis ist: " + spielerSumme);
                System.out.println("                 " +
                        "       ");

                System.out.println("Der Computer würfelt...");
                for (int i = 0; i < 6; i++) {
                    int wurf = random.nextInt(6) + 1;
                    computerSumme += wurf;
                    System.out.println("Computerwurf " + (i + 1) + ": " + wurf);
                }
                System.out.println("Gesamtergebnis Computer: " + computerSumme);


                if (spielerSumme > computerSumme) {
                    System.out.println("Sie haben das Spiel gewonnen.");
                } else if (computerSumme > spielerSumme) {
                    System.out.println("Sie haben das Spiel verloren.");
                } else {
                    System.out.println("Unentschieden.");
                }
            }

            isFinished = true;
        }
    }
}
