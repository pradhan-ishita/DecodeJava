package Strings;
public class deleteAndInsert {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abcdef");
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
        System.out.println(sb.charAt(3));
        sb.append("qwe");
        System.out.println(sb);//abcefqwe,want to delete cefq(2,5)
        sb.delete(2,6);//deletes charecters from 2 to 5
        System.out.println(sb);//
        sb.insert(2,"svg");
        System.out.println(sb);
    }
}
