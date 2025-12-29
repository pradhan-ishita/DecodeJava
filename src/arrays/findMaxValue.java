package arrays;

import java.util.Scanner;
public class findMaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int mx=arr[0];
        for(int i=1;i<n;i++) {
            if (arr[i] > mx)
                mx = arr[i];
        }
            System.out.println(mx);
    }
}
