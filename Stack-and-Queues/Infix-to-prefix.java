import java.util.*;

class Infix-to-prefix{
    // Function to return precedence of operators
    static int Prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // Function to check if character is operator
    static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }

    // Function to reverse a string and swap '(' with ')'
    static String reverse(String exp) {
        StringBuilder reversed = new StringBuilder();
        for (int i = exp.length() - 1; i >= 0; i--) {
            char c = exp.charAt(i);
            if (c == '(') {
                reversed.append(')');
            } else if (c == ')') {
                reversed.append('(');
            } else {
                reversed.append(c);
            }
        }
        return reversed.toString();
    }

    // Function to convert Infix to Postfix (helper)
    static String infixToPostfix(String exp) {
        String result = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c))
                result += c;
            else if (c == '(')
                stack.push(c);
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result += stack.pop();
                stack.pop();
            } else {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) {
                    result += stack.pop();
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }

    // Main function to convert Infix to Prefix
    static String infixToPrefix(String exp) {
        // Step 1: Reverse the infix expression and swap parentheses
        String reversedExp = reverse(exp);

        // Step 2: Convert the reversed expression to postfix
        String postfix = infixToPostfix(reversedExp);

        // Step 3: Reverse the postfix to get prefix
        return new StringBuilder(postfix).reverse().toString();
    }

    public static void main(String[] args) {
        String exp = "(p+q)*(m-n)";
        System.out.println("Infix expression: " + exp);
        System.out.println("Prefix expression: " + infixToPrefix(exp));
    }
}
