import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
Given the following inputs

String brackets = "[{{[(){}]}}[]{}{{(())}}]";
String brackets = "[{{}}[]{}{{(())}}]";
String brackets = "[{}{}{{()}}]";
String brackets = "[{}{{}}]";
String brackets = "[{{}}]";
String brackets = "[{}]";
String brackets = "";
Check if the following parenteshis are balanced. i.e

[] - true
[[] - false
({[]}) - true
({[}) - false
Think about which data structure you should use, implement the following method and write unit tests


public boolean isBalanced(String input) {
    return false;
}

 */
public class Exercise3 {

    public static void main(String[] args) {

        String brackets = "[{{[(){}]}}[]{}{{(())}}]";

        Stack <String> stack = new Stack<>();

        List <String>bracketList = new ArrayList<>();

        bracketList = List.of(brackets.split("")); // used List.of function

        //bracketChecker
        for (String bracket : bracketList) {
            if (bracket.equals("{") || bracket.equals("[") || bracket.equals("(")) {
                stack.push(bracket);
            }
            else if (bracket.equals("}") || bracket.equals("]") || bracket.equals(")")); {
                if (stack.peek().equals(bracket)) {
                    stack.pop();
                }
                break;
            }
        }

        Boolean isBalanced = false;

        if (stack.isEmpty()) {
            isBalanced = true;
        }
        else isBalanced = false;

        System.out.println("Brackets Balanced: " + isBalanced);

    }

}
