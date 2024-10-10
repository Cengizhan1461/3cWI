package While_Loops;

import java.util.Random;

public class While_Loop {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isFinished = false;
        int sum = 0;

        while(!isFinished){
            int randomValue = random.nextInt (10, 30);
            System.out.println("Nr: " + randomValue);

            if(randomValue == 15 || randomValue == 25){
                isFinished = true;

                System.out.println(randomValue);
            } else{
                sum = sum +randomValue;
                System.out.println(sum);
            }
        }
    }
}
