package interviewDiary;
import java.util.*;
public class GroupAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());
        String[] words = sc.nextLine().trim().split("\\s+");

        // LinkedHashMap to maintain insertion order
        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();

        for (String word : words) {
            // Sort the characters of the word to use as key
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // Group words with the same sorted key
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }

        // Print each group on a separate line
        for (List<String> group : map.values()) {
            System.out.println(String.join(" ", group));
        }

        sc.close();
    }

}
