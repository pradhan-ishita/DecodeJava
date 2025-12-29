package Strings;

public class stringBuilderFunctions {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("ishita");
        StringBuilder tb=new StringBuilder("ishika");
        System.out.println(sb.compareTo(tb));//find difference between the ascii value of the unmatched indexes
        System.out.println(sb.reverse());
    }
}
