package Conditonals;

import java.util.Scanner;

public class checkFiveDigit {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int n =sc.nextInt();
            if(n>9999 && n<100000)
                System.out.println("5 digit number");
            else System.out.println("Not a 5 digit number");
    }
}
