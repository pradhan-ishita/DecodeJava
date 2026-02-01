package interviewDiary;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        // Find divisors excluding the number itself
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Check perfect number
        if (sum == num && num != 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}

