package Recursion;

import java.util.Scanner;

public class NthStair1or3 {

    public static int stair(int n) {
        // Base cases
        if (n == 0)
            return 1; // one way: no jump
        if (n < 0)
            return 0; // no way

        // Recursive case
        return stair(n - 1) + stair(n - 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Number of ways = " + stair(n));

        sc.close();
    }
}