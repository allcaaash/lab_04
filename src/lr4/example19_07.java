package lr4;

public class example19_07 {
    public static void main(String[] args) {
        int height = 9;
        int weight = 9;
        int value = 0;
        boolean isReverse = false;

        int[][] array = new int [height][weight];

        for(int i = 0; i < height; i++){

            if (isReverse){
                for (int j = weight - 1; j >= 0; j--){
                    array[i][j] = value;
                    value++;
                    if (j == 0)
                        isReverse = false;
                }
            }
            else{
                for (int j = 0; j < weight; j++){
                    array[i][j] = value;
                    value++;
                    if (j == weight - 1)
                        isReverse = true;
                }
            }
        }

        for(int i = 0; i < height; i++){
            for (int j = 0; j < weight; j++){
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
