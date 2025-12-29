package Conditonals;
import java.util.Scanner;
public class calculatorSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a =sc.nextInt();
        System.out.println(" Enter the operand: ");
        char op= sc.next().charAt(0);
        System.out.println("Enter the value of b: ");
        int b=sc.nextInt();
        switch(op){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
