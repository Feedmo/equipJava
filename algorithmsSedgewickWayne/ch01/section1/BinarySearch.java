package equipJava.algorithmsSedgewickWayne.ch01.section1;

public class BinarySearch {
    public static int rank(int key, int[] a) {
        int lo = 0, hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] < key) lo = mid + 1;
            else if (a[mid] > key) hi = mid - 1;
            else return mid;
        }
        return -1;
    }

    // 该方法是为了方便以 func(int, int[]) 的方式调用
    public static int recursiveRank(int key, int[] a) {
        return recursiveRank(key, a, 0, a.length-1);
    }

    private static int recursiveRank(int key, int[] a, int lo, int hi) {
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (a[mid] > key) return recursiveRank(key, a, lo, mid-1);
        else if (a[mid] < key) return recursiveRank(key, a, mid+1, hi);
        return mid;
    }
}
