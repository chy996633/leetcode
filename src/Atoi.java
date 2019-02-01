/**
 * need to consider these conditions:
 * empty string
 * +/- symbol
 * whitespace
 * int border
 * other characters
 */
public class Atoi {

    public int myAtoi(String str) {
        str = str.trim();
        if (str == null || str.length() == 0) {
            return 0;
        }

        double result = 0;
        int flag = 1;
        char c = str.charAt(0);
        int i = 0;
        if (c == '-') {
            flag = -1;
            i++;
        } else if (c == '+') {
            i++;
        }

        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result = result*10 + (str.charAt(i) - '0');
            i++;
        }

        result = result * flag;

        if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int) result;
    }

}
