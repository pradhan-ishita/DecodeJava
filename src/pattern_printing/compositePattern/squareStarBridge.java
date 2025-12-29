package pattern_printing.compositePattern;

import java.util.Scanner;

public class squareStarBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        n--;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*" + " ");
            }
//
            System.out.print("  ");
            for (int j = 1; j <= n ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
