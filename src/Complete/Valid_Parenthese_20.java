package Complete;

import java.util.Stack;

public class Valid_Parenthese_20 {
    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> strings = new Stack<>();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{') {
                strings.push(chars[i]);
            } else {
                if (!strings.isEmpty()) {
                    if (chars[i] == ')') {
                        if (strings.peek().equals('(')) {
                            strings.pop();
                        } else {
                            return false;
                        }
                    } else if (chars[i] == ']') {
                        if (strings.peek().equals('[')) {
                            strings.pop();
                        } else {
                            return false;
                        }
                    } else if (chars[i] == '}') {
                        if (strings.peek().equals('{')) {
                            strings.pop();
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
        }
        return strings.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("]"));
    }
}
