package equipJava.algorithmsSedgewickWayne.ch01.section1;

// 0 1 1 2 3 | 5 8 13 21 34
public class Exercise19 {
    public static void main(String[] args) {
        System.out.println(fibonacciUsingArray(10));
        System.out.println(fibonacciUsingArray(51));
    }

    private static long fibonacciUsingArray(int n) {
        long[] a = new long[2];
        a[0] = 0;
        a[1] = 1;
        while (n > 1) {
            a[1] = a[0] + a[1];
            a[0] = a[1] - a[0];
            n--;
        }
        return a[0];
    }
}
