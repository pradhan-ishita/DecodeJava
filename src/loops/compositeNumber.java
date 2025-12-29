package loops;

import java.util.Scanner;

public class compositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        int x=0;//0 means prime number
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {//'i' is a factor of n
                System.out.println("Composite number");
                x=1; // 1 mean composite
                break;
            }
        }
        if(n==1) System.out.println("Neither prime nor composite number. ");
        if(x==0) System.out.println("Prime number");
    }
}
