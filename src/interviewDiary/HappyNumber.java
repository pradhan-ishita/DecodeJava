package interviewDiary;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class HappyNumber {

    // Method to check if a number is happy
    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sumOfSquares(n);
        }

        return n == 1;
    }

    // Helper method to calculate sum of squares of digits
    private static int sumOfSquares(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isHappy(n)) {
            System.out.println(n + " is a Happy Number");
        } else {
            System.out.println(n + " is NOT a Happy Number");
        }

        sc.close();
    }
}