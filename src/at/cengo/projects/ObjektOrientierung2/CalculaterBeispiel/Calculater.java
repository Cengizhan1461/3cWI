package at.cengo.projects.ObjektOrientierung2.CalculaterBeispiel;

public class Calculater {

        public int add(int a, int b) {
            return a + b;
        }

        public int sub(int a, int b) {
            return a - b;
        }

        public int multiplcate(int a, int b) {
            return a * b;
        }

        public int division(int a, int b) {
            if (b == 0) {
                System.out.println("Man darf mit 0 nicht dividieren!");
            }
            return a / b;
        }
}
