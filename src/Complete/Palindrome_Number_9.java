package Complete;

import java.util.ArrayList;
import java.util.Stack;

public class Palindrome_Number_9 {
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        char[] chars = s.toCharArray();
        ArrayList<Character> characters = new ArrayList<>();
        boolean res = false;
        for (char c : chars) {
            characters.add(c);
        }
        for (int i = 0; i < characters.size(); i++) {
            if (characters.get(i) == characters.get((characters.size() - 1) - i)) {
                res = true;
            } else {
                return false;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));

    }
}
