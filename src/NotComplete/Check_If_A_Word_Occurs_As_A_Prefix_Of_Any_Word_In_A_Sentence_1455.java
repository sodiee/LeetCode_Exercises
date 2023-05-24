package NotComplete;

public class Check_If_A_Word_Occurs_As_A_Prefix_Of_Any_Word_In_A_Sentence_1455 {
    public static int isPrefixOfWord(String sentence, String searchWord) {
        boolean found = false;
        int value = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.substring(i, i + 1).equals(searchWord.substring(0, 1))) {
                int j = 0;

                while (!found || j == searchWord.length()) {
                    if (sentence.substring(i, i + 1).equals(searchWord.substring(j, j + 1))) {
                        if (j == searchWord.length() - 1) {
                            value = i;
                            found = true;
                        }
                    }
                    j++;
                }
            }
        }
        if (found) {
            return value;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("i love eating burger", "burg"));

    }
}
