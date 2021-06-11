package equipJava.algorithmsSedgewickWayne.ch01.section1;

import edu.princeton.cs.algs4.StdOut;

// print fibonacci numbers
public class Exercise6 {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            g = f + g;
            f = g - f;
        }
    }
}