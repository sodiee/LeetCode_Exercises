package Complete;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters_3 {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int maxLength=0;
        int left=0;
        for(int right=0;right<s.length();right++){

            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxLength=Math.max(maxLength,right-left+1);

            }else{
                while(s.charAt(left)!=s.charAt(right)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));left++;
                set.add(s.charAt(right));
            }

        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(  lengthOfLongestSubstring("abcabcbb"));
        System.out.println(  lengthOfLongestSubstring("pwwkew"));
    }
}
