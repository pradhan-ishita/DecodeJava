package interviewDiary;

public class maxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {

        int n = nums.length;
        int count = 0;
        int max = 0;

        // Traverse the array
        for (int i = 0; i < n; i++) {

            // If the current element is 1, increase the count
            if (nums[i] == 1) {
                count++;
            }
            // If the current element is 0
            else {
                // Update the maximum consecutive 1s found so far
                max = Math.max(max, count);

                // Reset the count
                count = 0;
            }
        }

        // Handles the case when the array ends with 1s
        return Math.max(max, count);
    }

    public static void main(String[] args) {

        maxConsecutiveOnes obj = new maxConsecutiveOnes();

        int[] nums = {1, 1, 0, 1, 1, 1};

        int result = obj.findMaxConsecutiveOnes(nums);

        System.out.println("Maximum Consecutive Ones = " + result);
    }
}