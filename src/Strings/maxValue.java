package Strings;

import static java.lang.Math.max;

public class maxValue {
    public static void main(String[] args) {
        String[] arr = {"0000123", "45624", "8764689", "67425"};
        int mx = Integer.parseInt(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int n = Integer.parseInt(arr[i]);
            mx = Math.max(mx, n);
        }
        System.out.println(mx);
    }
}