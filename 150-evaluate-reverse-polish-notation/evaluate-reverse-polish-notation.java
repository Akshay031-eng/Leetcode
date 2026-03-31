import java.util.*;

class Solution {

    public int evalRPN(String[] tokens) {

        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens) {

            if (token.equals("-") || token.equals("+") || token.equals("*") || token.equals("/")) {

                int second = stack.pop();
                int first = stack.pop();

                int result = compute(first, second, token);
                stack.push(result);

            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.peek();
    }

    // ✅ Separate method (outside evalRPN)
    private int compute(int first, int second, String operator) {

        switch (operator) {
            case "+":
                return first + second;

            case "-":
                return first - second;

            case "*":
                return first * second;

            case "/":
                return first / second; // integer division

            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}