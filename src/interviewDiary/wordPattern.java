package interviewDiary;

import java.util.HashMap;

public class wordPattern {

    public static void main(String[] args) {

        String pattern = "abba";
        String s = "dog cat cat fish";

        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {

        String[] arr = s.split(" ");

        if (pattern.length() != arr.length) {
            return false;
        }

        HashMap<Character, String> hm = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);

            boolean containsKey = hm.containsKey(ch);

            // Same word cannot belong to two different characters
            if (hm.containsValue(arr[i]) && !containsKey) {
                return false;
            }

            if (containsKey) {
                if (!hm.get(ch).equals(arr[i])) {
                    return false;
                }
            } else {
                hm.put(ch, arr[i]);
            }
        }

        return true;
    }
}