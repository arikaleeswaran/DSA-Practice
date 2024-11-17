import java.util.Stack;

public class Paranthesis {
    static boolean isParenthesisBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (st.isEmpty()) return false;
                if ((ch == ')' && st.peek() == '(') ||
                        (ch == '}' && st.peek() == '{') ||
                        (ch == ']' && st.peek() == '[')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "({[]})";
        System.out.println("Is balanced: " + isParenthesisBalanced(s1)); // Output: true

        String s2 = "({[})";
        System.out.println("Is balanced: " + isParenthesisBalanced(s2)); // Output: false

        String s3 = "([])";
        System.out.println("Is balanced: " + isParenthesisBalanced(s3)); // Output: true

        String s4 = "([)]";
        System.out.println("Is balanced: " + isParenthesisBalanced(s4)); // Output: false

        String s5 = "";
        System.out.println("Is balanced: " + isParenthesisBalanced(s5)); // Output: true
    }
}
