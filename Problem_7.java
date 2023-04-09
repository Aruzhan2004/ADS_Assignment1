public class Problem_7 {
    public static void permutations(String prefix, String suffix) {
        int n = suffix.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permutations(prefix + suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i+1, n));
            }
        }
    }
}
