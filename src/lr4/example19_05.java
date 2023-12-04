package lr4;

import java.io.PrintStream;

public class example19_05 {
    public static void main(String[] args) {

        int height = 3;
        int width = 5;

        int[][] arrayOne = new int[height][width];

        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                arrayOne [i][j] = (int) (Math.random() * 100);
                System.out.print(arrayOne[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        System.out.print("\n");

        int[][] arrayTwo = new int[width][height];

        for (int i = 0; i < width; i++){
            for (int j = 0; j < height; j++){
                arrayTwo[i][j] = arrayOne[j][i];
                System.out.print(arrayTwo[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
