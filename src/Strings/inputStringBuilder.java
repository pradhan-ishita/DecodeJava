package Strings;

import java.util.Scanner;

public class inputStringBuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //1st method to take user input
        StringBuilder sb= new StringBuilder(sc.nextLine());
        System.out.println(sb);
        sb.setCharAt(1,'a');
        System.out.println(sb);
        //2nd method to take user input
        String a=sc.nextLine();
        StringBuilder tb= new StringBuilder(a);
        System.out.println(tb);
        tb.setCharAt(1,'a');
        System.out.println(tb);
    }
}
