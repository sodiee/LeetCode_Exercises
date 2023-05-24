package NotComplete;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Isomorphic_Strings_205 {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() == t.length()) {
            Map<String, Integer> mapS = new HashMap<>();
            Map<String, Integer> mapT = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                mapS.put(s.substring(i, i + 1), i);
                mapT.put(t.substring(i, i + 1), i);
            }
            int value = 0;
            for (int i = 0; i < mapS.size(); i++) {
                for (int j = i + 1; j == mapS.size() - 1; j++) {
                    if (Objects.equals(mapS.get(i), mapS.get(j))) {
                        value = i;
                    }
                }
            }

            if (Objects.equals(mapT.get(value), mapT.get(value + 1))) {
                return true;
            } else {

                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
    }
}
