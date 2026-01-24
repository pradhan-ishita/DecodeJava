package BinarySearch;

import java.util.HashSet;

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

    // Driver code
    public static void main(String[] args) {
        lengthOfLongestSubstring obj = new lengthOfLongestSubstring();

        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println(obj.lengthOfLongestSubstring(s1)); // 3
        System.out.println(obj.lengthOfLongestSubstring(s2)); // 1
        System.out.println(obj.lengthOfLongestSubstring(s3)); // 3
    }
}
