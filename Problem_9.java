public class Problem_9 {
    public static int findCn(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return findCn(n-1, k-1) + findCn(n-1, k);
        }
    }
}
