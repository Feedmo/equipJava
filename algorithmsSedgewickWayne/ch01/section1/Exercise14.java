package equipJava.algorithmsSedgewickWayne.ch01.section1;

public class Exercise14 {
    public static void main(String[] args) {
        System.out.println(lg(9));
        System.out.println(lg(15));
        System.out.println(lg(16));
        System.out.println(lg(32));
        System.out.println(lg(31));
    }

    // 15 -> 3; 16 -> 4
    // 注意次方从1开始计数，而0次方为1 
    private static int lg(int N) {
        int k = 0;
        while (N >= 2) {
            N /= 2;
            k++;
        }
        return k;
    }
}
