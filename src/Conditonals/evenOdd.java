package Conditonals;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        if (n%2 == 0)
            System.out.println("It is a even number.");
        if(n%2!=0)
                System.out.println("Odd number");


        }
    }
