package loops;

import java.util.Scanner;

public class GP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        //3,12,48...
        int a = 3;
        for (int i = 1; i <= n; i++) {
            a *= 4;
            System.out.println(a);
        }
    }
}
