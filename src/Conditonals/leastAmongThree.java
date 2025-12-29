package Conditonals;

import java.util.Scanner;
public class leastAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter b: ");
        int b = sc.nextInt();

        System.out.println("Enter c: ");
        int c = sc.nextInt();

         if (a<= b && a<= c)
            System.out.println(a +"is the least");
        else if (b<= c && b<= a)
            System.out.println(b+" is the least");
        else System.out.println(c+" is the least");
    }
}
