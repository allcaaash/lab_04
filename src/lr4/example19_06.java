package lr4;

public class example19_06 {
    public static void main(String[] args) {
        int height = 3;
        int width = 5;

        int[][] array = new int[height][width];
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                array [i][j] = (int) (Math.random() * 100);
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        System.out.print("\n");

        int deletedHeight = (int) (Math.random() * height - 1);
        int deletedWidth = (int) (Math.random() * width - 1);

        int[][] newArr = new int[height - 1][width - 1];
        int indexI = 0;
        for (int i = 0; i < height; i++) {
            if (i != deletedHeight) {
                int indexJ = 0;
                for (int j = 0; j < width; j++) {
                    if (j != deletedWidth) {
                        newArr[indexI][indexJ] = array[i][j];
                        System.out.print(newArr[indexI][indexJ]);
                        System.out.print(" ");
                        indexJ++;
                    }
                }
                System.out.print("\n");
                indexI++;
            }
        }
    }
}
