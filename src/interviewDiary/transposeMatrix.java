package interviewDiary;

import java.util.Scanner;

public class transposeMatrix {

    public static int[][] transpose(int[][] arr) {
        int m = arr.length;        // rows
        int n = arr[0].length;     // columns

        int[][] transpose = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[i][j] = arr[j][i];
            }
        }

        return transpose;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take rows and columns input
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Transpose
        int[][] result = transpose(arr);

        // Print transpose matrix
        System.out.println("Transpose Matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

