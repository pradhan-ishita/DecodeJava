package BinarySearch;

public class smallestDivisor {

    public boolean isLess(int mid, int[] arr, int t) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % mid == 0)
                sum += arr[i] / mid;
            else
                sum += arr[i] / mid + 1;
        }

        return sum <= t;
    }

    public int smallestDivisor(int[] arr, int t) {
        int mx = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            mx = Math.max(mx, arr[i]);
        }

        int d = 1;
        int lo = 1, hi = mx;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (isLess(mid, arr, t)) {
                d = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return d;
    }

    public static void main(String[] args) {
        smallestDivisor obj = new smallestDivisor();

        int[] arr = {1, 2, 5, 9};
        int t = 6;

        System.out.println(obj.smallestDivisor(arr, t)); // Output: 5
    }
}
