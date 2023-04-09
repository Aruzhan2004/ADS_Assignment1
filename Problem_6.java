public class Problem_6 {
    public static int pow(int a, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            int b = pow(a, n / 2);
            return b * b;
        } else {
            int b = pow(a, (n - 1) / 2);
            return a * b * b;
        }
    }
}
