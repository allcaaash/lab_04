package lr4;

public class example19_01 {
    public static void main(String[] args) {

        int height = 11;
        int width = 23;

        char[][] array = new char[height][width];

        for (int i = 0; i < height; i++){

            for (int j = 0; j < width; j++){

                if (i == 0 || i == height - 1 || j == 0 || j == width - 1){
                    array[i][j] = '*';
                }
                else{
                    array [i][j] = ' ';
                }
            }
        }

        //on screen
        for (int i = 0; i < height; i++){

            for (int j = 0; j < width; j++){

                System.out.print(array[i][j]);
            }

            System.out.println();
        }
    }
}
