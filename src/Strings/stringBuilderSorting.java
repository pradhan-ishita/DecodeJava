package Strings;
import java.util.Arrays;
public class stringBuilderSorting {
    public static void main(String[] args) {
//        String s="ishita";
//        char[] ch=s.toCharArray();
//        Arrays.sort(ch);
//        System.out.println("Sorted String:");
//        for(char ele:ch){
//            System.out.print(ele);
//        }
//        System.out.println();
        StringBuilder sb=new StringBuilder("pradhan");
        char[]arr=sb.toString().toCharArray();
        Arrays.sort(arr);
        System.out.println("Sorted StringBuilder:");
        for (char c : arr) {
            System.out.print(c);
        }
    }
}
