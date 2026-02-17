package interviewDiary;

import java.util.HashSet;
import java.util.Scanner;

public class lengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        lengthOfLongestSubstring obj = new lengthOfLongestSubstring();
        int result = obj.lengthOfLongestSubstring(input);

        System.out.println("Length of Longest Substring Without Repeating Characters: " + result);

        sc.close();
    }
}

