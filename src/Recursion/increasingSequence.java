package Recursion;

import java.util.ArrayList;

public class increasingSequence {
    static void generate(int current, int n, int k, ArrayList<Integer> ans) {

        if (ans.size() == k) {
            System.out.println(ans);
            return;
        }

        if (current > n) return;

        // Take current number
        ans.add(current);
        generate(current + 1, n, k, ans);

        // Don't take current number
        ans.removeLast();
        generate(current + 1, n, k, ans);
    }

    public static void main(String[] args) {
        generate(1, 6, 4, new ArrayList<>());
    }

}
