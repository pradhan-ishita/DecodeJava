package interviewDiary;

import java.util.Scanner;

public class powerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();

        powerOfTwo obj = new powerOfTwo();
        boolean result = obj.isPowerOfTwo(n);

        System.out.println(result);

        scanner.close();


    }
}
