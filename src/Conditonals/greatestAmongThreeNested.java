package Conditonals;

import java.util.Scanner;

public class greatestAmongThreeNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter b: ");
        int b = sc.nextInt();

        System.out.println("Enter c: ");
        int c = sc.nextInt();
        if(a>b){
            if(a>c) System.out.println(b +" is the greatest");
            else System.out.println(c +" is the greatest");
        }
        else{//b>a
            if (b>c) System.out.println(b +" is the greatest");
            else System.out.println(c +" is the largest");
        }
    }
}

