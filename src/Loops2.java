public class Loops2 {

    static
    int sum = 0;
    public static void main(String[] args) {
        for(int i=2; i <= 1000; i = i+2){
            sum = sum+i;
        }
        System.out.println("Die Summe aller geraden Zahlen beträgt" + sum);
    }
}
