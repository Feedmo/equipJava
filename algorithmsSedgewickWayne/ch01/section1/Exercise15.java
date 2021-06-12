package equipJava.algorithmsSedgewickWayne.ch01.section1;

public class Exercise15 {
    public static void main(String[] args) {
        int[] a = {3, 0, 2, 1, 2};
        int[] result = histogram(a, 5);
        int sum = 0;

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
            sum += result[i];
        }
        System.out.println();
        System.out.println(sum);
    }

    private static int[] histogram(int[] a, int M) {
        // 声明数组会自动初始化
        int[] result = new int[M];

        for (int i = 0; i < M; i++) {
            result[a[i]]++;
        }
        return result;
    }
}
