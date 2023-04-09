public class Problem_3 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        return isPrimeHelper(n, 2);
    }

    private static boolean isPrimeHelper(int n, int factor) {
        if (factor * factor > n) {
            return true;
        }
        if (n % factor == 0) {
            return false;
        }
        return isPrimeHelper(n, factor + 1);

    }
}
