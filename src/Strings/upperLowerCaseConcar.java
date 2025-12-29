package Strings;

public class upperLowerCaseConcar {
    public static void main(String[] args) {
        String s="Ishita is 21 years old";
        System.out.println(s.toLowerCase());
        //s.toLowerCase();-> nothing will happen
        s=s.toLowerCase();
        System.out.println(s);
        System.out.println(s.toUpperCase());
        String a="Ishita";
        String b="Pradhan";
        //a.concat(b);->nothing will happen
        System.out.println(a.concat(b));
        System.out.println(a);
        a=a.concat(b);
        System.out.println(a);
    }
}
