package interviewDiary;

public class FindNumWithEvenNumOfDigit {

    public static int findNumbers(int[] nums) {

        int evenCount = 0;

        for (int number : nums) {

            int digits = 0;

            while (number > 0) {
                number = number / 10;
                digits++;
            }

            if (digits % 2 == 0) {
                evenCount++;
            }
        }

        return evenCount;
    }

    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896};

        System.out.println(findNumbers(nums));
    }
}