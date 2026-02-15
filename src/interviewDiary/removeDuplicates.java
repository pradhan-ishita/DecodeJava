package interviewDiary;

import java.util.Scanner;

public class removeDuplicates {

    // Method should return int (not void)
    public static int removeDuplicates(int[] nums) {

        if (nums.length <= 2) {
            return nums.length;
        }

        int i = 2;

        for (int j = 2; j < nums.length; j++) {

            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Take elements
        System.out.println("Enter elements (sorted): ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = removeDuplicates(nums);

        // Print result
        System.out.println("Length after removing duplicates: " + k);
        System.out.print("Modified array: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
