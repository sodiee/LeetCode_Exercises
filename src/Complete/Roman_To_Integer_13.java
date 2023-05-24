package Complete;

public class Roman_To_Integer_13 {
    public static int romanToInt(String s) {
        int resInt = 0;
        String upperCaseInput = s.toUpperCase(); // Konverter input til store bogstaver
        char[] sToArray = upperCaseInput.toCharArray();

        for (int i = 0; i < sToArray.length; i++) {
            if (sToArray[i] == 'I') {
                resInt += 1;
                if (i < sToArray.length - 1 && (sToArray[i + 1] == 'X' || sToArray[i + 1] == 'V')) {
                    resInt -= 2;
                }
            } else if (sToArray[i] == 'V') {
                resInt += 5;
            } else if (sToArray[i] == 'X') {
                resInt += 10;
                if (i < sToArray.length - 1 && (sToArray[i + 1] == 'L' || sToArray[i + 1] == 'C')) {
                    resInt -= 20;
                }
            } else if (sToArray[i] == 'L') {
                resInt += 50;
            } else if (sToArray[i] == 'C') {
                resInt += 100;
                if (i < sToArray.length - 1 && (sToArray[i + 1] == 'D' || sToArray[i + 1] == 'M')) {
                    resInt -= 200;
                }
            } else if (sToArray[i] == 'D') {
                resInt += 500;
            } else if (sToArray[i] == 'M') {
                resInt += 1000;
            }
        }
        return resInt;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("XL"));
        System.out.println(romanToInt("XC"));
        System.out.println(romanToInt("CD"));
        System.out.println(romanToInt("CM"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
