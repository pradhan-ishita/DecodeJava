package Recursion;

public class functionCalls {
//    public static void mango(){
//        System.out.println("Hi i am in mango");
//
//    }
//    public static void banana(){
//        System.out.println("Hi i am in banana");
//        mango();
//
//    }
//    public static void apple(){
//        System.out.println("Hi i am in  apple");
//        banana();
//
//    }
//    public static void main(String[] args) {
//        System.out.println("Hi i am in main method ");
//        apple();
//    }
public static void mango(){
       System.out.println("Hi i am in mango");
 }
public static void banana() {
    mango();
    System.out.println("Hi i am in banana");
}
public static void apple() {
    banana();
    System.out.println("Hi i am in  apple");
    mango();
}
public static void main(String[] args) {
    System.out.println("Hi I am in main");
    apple();
}
}
