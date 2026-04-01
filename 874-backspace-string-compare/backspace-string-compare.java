import java.util.*;

class Solution {
    
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    
    // Helper function to process string
    private String build(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : str.toCharArray()) {
            if (ch != '#') {
                stack.push(ch);  // type character
            } else {
                if (!stack.isEmpty()) {
                    stack.pop(); // backspace
                }
            }
        }
        
        // convert stack to string
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }
        
        return result.toString();
    }
}