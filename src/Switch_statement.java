import java.util.Random;

public class Switch_statement {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(5, 10);
        switch(randomNumber){
            case 10:
                System.out.println("Ten");


            case 9:
                System.out.println("Nine");


            case 8:
                System.out.println("Eight");


            case 7:
                System.out.println("Seven");

            case 6:
                System.out.println("Six");

            case 5:
                System.out.println("Five");
                break;
        }


    }

}