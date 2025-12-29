package loops;

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        //1,3,5...
        for(int i=1;i<=2*n-1;i+=2){
            System.out.println(i);
            //n rounds
        }
    }
}
