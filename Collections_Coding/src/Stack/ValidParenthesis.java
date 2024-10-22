package Stack;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            // If it's an opening bracket, push onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // If it's a closing bracket
            else {
                if (stack.isEmpty()) {
                    return false; // No opening bracket for this closing bracket
                }
                char top = stack.pop();
                // Check if the closing bracket matches the top of the stack
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        // If the stack is empty, all opening brackets were matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test1 = "()[]{}";      // true
        String test2 = "(]";          // false
        String test3 = "([)]";        // false
        String test4 = "{[]}";        // true
        
        System.out.println(isValid(test1)); // Output: true
        System.out.println(isValid(test2)); // Output: false
        System.out.println(isValid(test3)); // Output: false
        System.out.println(isValid(test4)); // Output: true
    }
}
