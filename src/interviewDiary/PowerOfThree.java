package interviewDiary;

import java.util.Scanner;

public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 3 == 0) {
            n = n / 3;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        System.out.println(isPowerOfThree(n));

        sc.close();
    }
}

