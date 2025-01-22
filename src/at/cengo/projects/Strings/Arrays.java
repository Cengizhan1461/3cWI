package at.cengo.projects.Strings;

public class Arrays {
    public static void main(String[] args) {
    int [] throwsArrays = new int[6];

    throwsArrays[4] = 9;


        for (int i = 0 ; i < throwsArrays.length; i++){
            System.out.print(throwsArrays[i] + " ");
        }

            int[][] playground= new int [3][3];

        playground[0][0] = 1;
        playground[2][1] = 2;

        System.out.println("----------------");


        for (int row = 0; row < playground.length; row ++) {
            for (int col = 0; col < playground.length; col++){
                System.out.print(playground[row][col] + " ");

            }
            System.out.println();
        }
    }
}
