package interviewDiary;

import java.util.Arrays;

public class numberSequence {

    public int numSubseq(int[] nums, int target) {

        int MOD = 1000000007;
        int n = nums.length;

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Precompute powers of 2 modulo MOD
        int[] power = new int[n];
        power[0] = 1;

        for (int i = 1; i < n; i++) {
            power[i] = (power[i - 1] * 2) % MOD;
        }

        // Step 3: Use two pointers
        int left = 0;
        int right = n - 1;
        int result = 0;

        while (left <= right) {

            if (nums[left] + nums[right] <= target) {
                result = (result + power[right - left]) % MOD;
                left++;
            } else {
                right--;
            }
        }

        return result;
    }

    // Main method for testing
    public static void main(String[] args) {

        numberSequence obj = new numberSequence();

        int[] nums = {3, 5, 6, 7};
        int target = 9;

        int ans = obj.numSubseq(nums, target);

        System.out.println("Number of valid subsequences: " + ans);
    }
}