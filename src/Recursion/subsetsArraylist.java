package Recursion;

import java.util.ArrayList;

public class subsetsArraylist {

    static ArrayList<String> arr = new ArrayList<>();//global

    public static void printSubsetsArraylist(int i, String s, String ans) {

        // Base case
        if (i == s.length()) {
            arr.add(ans);
            return;
        }

        char ch = s.charAt(i);

        // Not take the current character
        printSubsetsArraylist(i + 1, s, ans);//take
        ans +=s.charAt(i);
        // Take the current character
        printSubsetsArraylist(i + 1, s, ans + ch);//not take
    }

    public static void main(String[] args) {

        String s = "abc";
        arr =new ArrayList<>();//for reset

        printSubsetsArraylist(0, s, "");

        System.out.println(arr);
    }
}