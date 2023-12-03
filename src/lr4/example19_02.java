package lr4;

public class example19_02 {
    public static void main(String[] args) {
        int height = 11;
        int width = 23;

        for (int i = 0; i < height; i++){

            for (int j = 0; j < width; j++){

                if (j == 0 || (j == i+1 && i != 0) || i == height-1 && j < width/2){
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }
            }

            System.out.println();
        }
    }
}
