import java.util.Stack;

public class ValidParentheses {

    // 20. ValidParentheses
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || Math.abs(c - stack.pop()) > 2) { // the difference between their ASCII codes is max 1 or 2. Example, '(' = 40, ')' = 41
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        ValidParentheses main = new ValidParentheses();
        boolean result = main.isValid("([])");
        System.out.println(result);
    }

}
