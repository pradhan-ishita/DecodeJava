package interviewDiary;
import java.util.Arrays;
public class minPairSum {

    public static int minPairSum(int[] nums) {
        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Initialize two pointers
        int i = 0;
        int j = nums.length - 1;

        // Step 3: Store the maximum pair sum
        int result = 0;

        // Step 4: Pair the smallest and largest elements
        while (i < j) {
            int sum = nums[i] + nums[j];
            result = Math.max(result, sum);
            i++;
            j--;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {3, 5, 2, 3};

        int answer = minPairSum(nums);

        System.out.println("Minimum Maximum Pair Sum = " + answer);
    }
}