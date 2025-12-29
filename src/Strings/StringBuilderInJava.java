package Strings;

public class StringBuilderInJava {
    public static void main(String[] args) {
        //String s=new String("Ishita");
        StringBuilder sb=new StringBuilder("Ishita");
        System.out.println(sb.length());
        StringBuilder x=new StringBuilder(10);
        StringBuilder y=new StringBuilder("10");
        System.out.println(x);
        System.out.println(y);
        System.out.println(x.length());
        System.out.println(x.capacity());
        System.out.println(y.length());
        System.out.println(y.capacity());
        StringBuilder a=new StringBuilder(2);
        System.out.println(a.capacity());
        String s="";
        StringBuilder b=new StringBuilder(s);
        System.out.println(b.length());
        System.out.println(b.capacity());
    }
}
