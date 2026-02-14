package interviewDiary;

import java.util.Scanner;

public class BaseConvertInto7 {

    public static String convertToBase7(int num) {

        if (num == 0) {
            return "0";
        }

        boolean isNegative = num < 0;
        num = Math.abs(num);

        StringBuilder result = new StringBuilder();

        while (num > 0) {
            int remainder = num % 7;
            result.append(remainder);
            num = num / 7;
        }

        if (isNegative) {
            result.append("-");
        }

        return result.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        String base7 = convertToBase7(num);

        System.out.println("Base 7 representation: " + base7);

        sc.close();
    }
}
