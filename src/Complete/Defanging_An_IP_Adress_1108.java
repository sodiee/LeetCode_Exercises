package Complete;

public class Defanging_An_IP_Adress_1108 {
    public static String defangIPaddr(String address) {
        char[] chars = address.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if (address.charAt(i) == '.') {
                sb.append("[.]");
            } else {
                sb.append(address.charAt(i) + "");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("111.000.11.22"));
    }
}
