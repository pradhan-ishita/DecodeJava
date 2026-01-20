package interviewDiary;

public class validPalindrome {

    public boolean isPalindrome(String s) {
        int lo = 0, hi = s.length() - 1;

        while (lo < hi) {

            // skip non-alphanumeric from left
            while (lo < hi && !Character.isLetterOrDigit(s.charAt(lo))) {
                lo++;
            }

            // skip non-alphanumeric from right
            while (lo < hi && !Character.isLetterOrDigit(s.charAt(hi))) {
                hi--;
            }

            if (Character.toLowerCase(s.charAt(lo)) !=
                    Character.toLowerCase(s.charAt(hi))) {
                return false;
            }

            lo++;
            hi--;
        }

        return true;
    }

    public static void main(String[] args) {
        validPalindrome obj = new validPalindrome();

        System.out.println(obj.isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(obj.isPalindrome("race a car")); // false
        System.out.println(obj.isPalindrome(" ")); // true
    }
}

