package interviewDiary;

import java.util.Scanner;

public class uglyNumber {
    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false; // Ugly numbers are positive
        }

        int[] primes = {2, 3, 5};
        for (int prime : primes) {
            while (n % prime == 0) {
                n /= prime;
            }
        }

        return n == 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isUgly(n)) {
            System.out.println(n + " is an ugly number.");
        } else {
            System.out.println(n + " is not an ugly number.");
        }

        sc.close();
    }
}
