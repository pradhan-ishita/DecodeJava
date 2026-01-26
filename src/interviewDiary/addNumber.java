package interviewDiary;

import java.util.Scanner;

public class addNumber {
    public int addDigits(int num) {
        while (num >= 10) {   // more than one digit
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        addNumber obj = new addNumber();
        int result = obj.addDigits(num);

        System.out.println("Single digit result: " + result);

        sc.close();
    }
}
