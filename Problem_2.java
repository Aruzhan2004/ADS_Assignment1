public class Problem_2 {
    public double getAverage(int[] arr) {
        return getSum(arr, arr.length) / (double) arr.length;
    }

    private int getSum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        } else {
            return arr[n - 1] + getSum(arr, n - 1);
        }
    }
}
