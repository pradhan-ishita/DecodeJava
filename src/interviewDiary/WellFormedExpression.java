package interviewDiary;
import java.util.*;
public class WellFormedExpression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.print("Enter expression: ");
        String exp = sc.nextLine();

        boolean valid = true;

        for(int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }

            else if(ch == ')' || ch == '}' || ch == ']'){

                if(stack.isEmpty()){
                    valid = false;
                    break;
                }

                char top = stack.pop();

                if((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')){
                    valid = false;
                    break;
                }
            }
        }

        if(valid && stack.isEmpty()){
            System.out.println("Expression is Well Formed");
        } else {
            System.out.println("Expression is Not Well Formed");
        }
    }
}
