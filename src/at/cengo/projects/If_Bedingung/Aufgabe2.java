package at.cengo.projects.If_Bedingung;

import java.util.Random;

public class Aufgabe2 {
    public static void main(String[] args) {
            // Erstelle zwei Zufallszahl zwischen 0 und 100
            Random random = new Random();
            Random random2 = new Random();
            int randomNumber2 = random2.nextInt(100);
            int randomNumber = random.nextInt(100);

            if (randomNumber < randomNumber2 && randomNumber < 50) {
                System.out.println("Zahl 1 ist kleiner als Zahl 2 und mini");
            } else if (randomNumber < 30 || randomNumber2 < 30) {
                System.out.println("Eine der beiden ist kleiner als 30.");
            } else if (randomNumber < 50 && randomNumber2 != 50) {
                System.out.println("Erste Zahl klein zweite Zahl kein 50iger");
            }

            // Wenn die erste Zahl kleiner ist als die zweite UND die erste Zahl kleiner ist als 50
            // dann gib aus "Zahl 1 ist kleiner als Zahl 2 und Mini"

            // Wenn die erste Zahl kleiner ist als 30 oder die zweite Zahl kleiner ist als 30
            // dann gib aus "Eine der beiden ist kleiner als 30"

            // Wenn die erste Zahl kleiner ist als 50 UND die zweite Zahl ungleich 50 ist
            // dann gib aus "Erste Zahl klein, zweite kein 50iger"

        }
    }
