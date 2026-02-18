package interviewDiary;

import java.util.Scanner;

public class singleNumber {

    public static int findSingleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result = result ^ num;   // XOR operation
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int answer = findSingleNumber(nums);

        System.out.println("Single Number: " + answer);

        sc.close();
    }
}

