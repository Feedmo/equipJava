package equipJava.algorithmsSedgewickWayne.ch01.section1;

public class Exercise11 {
    public static void main(String[] args) {
        boolean[][] a = {
            {true, false, true},
            {false, true, true}
        };
        printBooleanTable(a);
    }

    private static void printBooleanTable(boolean[][] table) {
        int rows = table.length;
        int cols = table[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (table[i][j] == true) System.out.print("*");
                else System.out.print(" ");
                // 直接在内层循环之后加换行打印即可 
                // if (j == cols - 1) System.out.println();
            }
            System.out.println();
        }
    }
}
