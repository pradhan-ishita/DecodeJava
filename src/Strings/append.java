package Strings;

public class append {
    public static void main(String[] args) {
        StringBuilder s =new StringBuilder("Ishita");
        System.out.println(s);
        //append can be done only at the end
        s.append(21);
        System.out.println(s);
        s.append("*");
        System.out.println(s);
        s.append("xyz");
        System.out.println(s);
        char[]ch={'i','s','t'};
        s.append(ch);
        System.out.println(s);
//        int[]arr={1,2,3,4,5};
//        s.append(arr);//does not work,address is appended
//        System.out.println(s);
        StringBuilder t =new StringBuilder("pqr");
        s.append(t);
        System.out.println(s);
       // s+="werr";//not possible ,possible in string
    }
}
