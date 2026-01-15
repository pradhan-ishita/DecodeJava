public class upperBound {

    static class Solution {
        public int[] searchRange(int[] arr, int target) {
            int[] ans = {-1, -1};
            int n = arr.length;

            // First check if element is present
            int lo = 0, hi = n - 1;
            boolean flag = false;

            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (arr[mid] == target) {
                    flag = true;
                    break;
                } else if (arr[mid] > target) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }

            if (!flag) return ans;

            // Find lower bound (first occurrence)
            lo = 0;
            hi = n - 1;
