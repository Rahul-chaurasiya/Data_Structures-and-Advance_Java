import java.util.*;
public class j03_balanced_parenthesis {
    static boolean isBalanced(String s) {
        Stack<Character> str = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == '(' || x == '{' || x == '[')
                str.push(x);

            else {
                if (str.isEmpty() == true)
                    return false;
                else if (ismatching(str.peek(), x) == false)
                    return false;
                else
                    str.pop();
            }
        }
        if(str.isEmpty()==false)return false;
        return true;
    }

    static boolean ismatching(char a, char b) {
        return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' & b == ']');
    }

    public static void main(String[] args) {

        String s = "{[";
        System.out.println(isBalanced(s));

    }
}


// ==================================================================================


import java.util.*;
public class j03_balanced_parenthesis {
    static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String s = "{[()]}";
        System.out.println(isBalanced(s));

    }
}
