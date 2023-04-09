public class Problem_1 {
    public static int findMinimum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        } else {
            int min = findMinimum(arr, n - 1);
            if (arr[n - 1] < min) {
                return arr[n - 1];
            } else {
                return min;
            }
        }
    }
}
