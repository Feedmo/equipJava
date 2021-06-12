package equipJava.algorithmsSedgewickWayne.ch01.section1;

// 不理解，数学底子实在太差...
public class Exercise18 {
    public static void main(String[] args) {
        System.out.println(mysteryMultiple(3, 25));
        System.out.println(mysteryMultiple(3, 11));

        System.out.println(mysteryCube(2, 4));
        System.out.println(mysteryCube(3, 4));
    }

    public static int mysteryMultiple(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mysteryMultiple(a+a, b/2);
        return mysteryMultiple(a+a, b/2) + a;
    }

    public static int mysteryCube(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return mysteryMultiple(a*a, b/2);
        return mysteryMultiple(a*a, b/2) * a;
    }
}
