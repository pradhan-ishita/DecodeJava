package Conditonals;

import java.util.Scanner;

public class divisibleBy5 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 5 == 0)
            System.out.println("It is a divisible by 5.");
        else
            System.out.println("not divisible");
    }
}
