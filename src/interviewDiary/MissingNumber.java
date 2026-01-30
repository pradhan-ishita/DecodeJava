package interviewDiary;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        int actualSum = 0;

        // Read array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            actualSum += nums[i];
        }

        // Expected sum of numbers from 0 to n
        int expectedSum = n * (n + 1) / 2;

        // Missing number
        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number is: " + missingNumber);

        sc.close();
    }
}

