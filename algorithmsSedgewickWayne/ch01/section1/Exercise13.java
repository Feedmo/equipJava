package equipJava.algorithmsSedgewickWayne.ch01.section1;

public class Exercise13 {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        transpose(a);
    }

    private static void transpose(int[][] array) {
        int[][] newArray = new int[array[0].length][array.length];        

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                newArray[j][i] = array[i][j];
            }
        }

        printArray(newArray);
    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
