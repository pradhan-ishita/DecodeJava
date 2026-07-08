package interviewDiary;

import java.util.HashSet;

public class longestBalancedSubarray {

    public int longestBalanced(int[] nums) {

        int n = nums.length;
        int maxLen = 0;

        // Try every starting index
        for (int i = 0; i < n; i++) {

            HashSet<Integer> even = new HashSet<>();
            HashSet<Integer> odd = new HashSet<>();

            // Extend the subarray
            for (int j = i; j < n; j++) {

                if (nums[j] % 2 == 0) {
                    even.add(nums[j]);
                } else {
                    odd.add(nums[j]);
                }

                // If number of distinct even and odd elements are equal
                if (even.size() == odd.size()) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

        longestBalancedSubarray obj = new longestBalancedSubarray();

        int[] nums = {2, 4, 1, 3, 6, 5};

        System.out.println(obj.longestBalanced(nums));
    }
}