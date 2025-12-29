package Strings;
import java.util.Scanner;
public class toggleString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        StringBuilder tb= new StringBuilder(a);
        System.out.println(tb);
        for (int i = 0; i < tb.length(); i++) {
            char ch=tb.charAt(i);
            int ascii=(int)ch;//type cast the character into it         c ccnbviSHitAs ascii value
            if(ascii>=65 && ascii<=90) {//capital
                ascii+=32;
                ch=(char)ascii;
                tb.setCharAt(i,ch);
            }
            if(ascii>=97 && ascii<=122) {//small
                ascii-=32;
                ch=(char)ascii;
                tb.setCharAt(i,ch);
            }
        }
        System.out.println(tb);
        }
    }

