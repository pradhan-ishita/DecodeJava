package TwoDimentionalArray;

import java.util.Scanner;

public class outputUsingNestedLoops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr =new int [2][3];
        int m=arr.length;
        System.out.println(m);
        //input
        for(int i=0;i<m;i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();

            }
                     }
        //output
        for(int i=0;i<m;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");

            }
        }

    }
}
