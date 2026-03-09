package interviewDiary;
import java.util.*;

public class PalindromeStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // push characters into stack
        for(int i = 0; i < str.length(); i++){
            stack.push(str.charAt(i));
        }
        String rev = "";
        while(!stack.isEmpty()){
            rev = rev + stack.pop();
        }

        //palindrome
        if(str.equals(rev)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
