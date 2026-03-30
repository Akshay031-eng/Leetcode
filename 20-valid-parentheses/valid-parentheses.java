class Solution {
    boolean isMatchPair(char open, char close) {
        if (open == '(' && close == ')') return true;
        if (open == '{' && close == '}') return true;
        if (open == '[' && close == ']') return true;
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        // step  =1 traverse
        for(char bracket : s.toCharArray()){
            if(bracket == '('|| bracket == '{' || bracket == '['){
                stack.push(bracket);
            }
            else if(stack.isEmpty() || !isMatchPair(stack.pop() , bracket) ){
                return false;
            }
        }
        return stack.isEmpty();
    }
}