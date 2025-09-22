class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>(); // stack to keep track of opening brackets

        // loop through each character
        for (char ch : s.toCharArray()) {

            // if it's an opening bracket, push it to stack
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } 
            else { // if it's a closing bracket
                if (stack.isEmpty()) return false; // nothing to match with

                char top = stack.pop(); // get the last opening bracket

                // check if opening and closing brackets match
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false; // mismatch found
                }
            }
        }

        // in the end, stack must be empty (all matched)
        return stack.isEmpty();
    }
}
