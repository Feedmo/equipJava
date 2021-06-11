package equipJava.algorithmsSedgewickWayne.ch01.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise5 {
    public static void main(String[] args) {
        isStrictlyBetween0And1(0.0013, 0.9012);
        StdOut.println("Expected: true");
        
        isStrictlyBetween0And1(0.00103, 1.00103);
        StdOut.println("Expected: false");

        isStrictlyBetween0And1(10.001013, 10.001013);
        StdOut.println("Expected: false");
    }

    private static void isStrictlyBetween0And1(double x, double y) {
        if (x > 0 && x < 1 && y > 0 && y < 1)
            StdOut.println("true");
        else
            StdOut.println("false");
    }
}