package equipJava.algorithmsSedgewickWayne.ch01.section1;

// print the binary representation of a positive integer N into a String s
public class Exercise9 {
    public static void main(String[] args) {
        String result1 = convertWithStringBuilder(16);
        String result2 = convertWithStringConcatenation(16);
        String result3 = convertWithRecursion(6);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }   

    private static String convertWithStringBuilder(int n) {
        StringBuilder s = new StringBuilder();
        while (n > 0) {
            s.append(n % 2);
            n /= 2;
        }
        return s.reverse().toString();
    }

    private static String convertWithStringConcatenation(int n) {
        String s = "";
        for (; n > 0; n /= 2) {
            s = n % 2 + s;
        }
        return s;
    }

    private static String convertWithRecursion(int n) {
        if (n == 0) return "";
        return convertWithRecursion(n / 2) + Integer.toString(n % 2);
    }
}
