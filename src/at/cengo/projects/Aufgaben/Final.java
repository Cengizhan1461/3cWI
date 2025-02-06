package at.cengo.projects.Aufgaben;

public class Final {



    //In Java bedeutet das Schlüsselwort final,
    //dass eine Variable, Methode oder Klasse nicht mehr verändert
    //oder überschrieben werden kann.
    //Es kann in drei Kontexten verwendet werden:

    //final verhindert Änderungen an Variablen.
    //final verhindert das Überschreiben von Methoden.
    //final verhindert die Vererbung einer Klasse.


    public static void main(String[] args) {
        final int x = 10; // Korrekt
         x = 20;  // Fehler: x kann nicht erneut zugewiesen werden


        final class A { }
        class B extends A { } // Fehler! Klasse kann nicht geerbt werden.




        class A {
            final void show() {
                System.out.println("Finale Methode");
            }
        }
        class B extends A {
            void show() { // Fehler! Methode kann nicht überschrieben werden.
                System.out.println("Nicht erlaubt");
            }
        }

    }
}
