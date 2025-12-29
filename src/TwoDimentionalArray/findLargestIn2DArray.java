package TwoDimentionalArray;

import java.util.Scanner;

public class findLargestIn2DArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int[][] arr = new int[4][3];
//        System.out.println("Enter 12 elements:");
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 3; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        int mx = arr[0][0];   // initialize once
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (arr[i][j] > mx) {
//                    mx = arr[i][j];
//                }
//            }
//        }
//        System.out.println("Largest element = " + mx);
        int[][]arr={{1,5,6},{2,-9,56},{3,5,6}};
        int mx=Integer.MIN_VALUE;
        int m =arr.length;
        int n=arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mx=Math.max(mx,arr[i][j]);

            }

        }
        System.out.println(mx);
 }

}
