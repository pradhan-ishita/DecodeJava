package pattern_printing;

import java.util.Scanner;

public class starRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of rows: ");
        int m=sc.nextInt();
        System.out.println("Value of columns: ");
        int n=sc.nextInt();
        for(int i=0;i<m;i++){
            for(int j=0;j<=n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}
