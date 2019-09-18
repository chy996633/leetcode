/**
 * @author <a herf="chenhy@itek-china.com">陈海越</a>
 * @version 1.0
 * @since 新标准版5.0
 *
 * <pre>
 * 历史：
 *      建立: 2019/9/6 陈海越
 *        </pre>
 */
public class MultipleStrings {

    public static String multiply(String num1, String num2) {
        String s1 = new StringBuilder(num1).reverse().toString();
        String s2 = new StringBuilder(num2).reverse().toString();

        int[] numArr = new int[num1.length() + num2.length()];
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                numArr[i+j] += (s1.charAt(i) - '0') * (s2.charAt(j) - '0');
            }
        }

        for (int i = 0; i < numArr.length - 1; i++) {
            if (numArr[i] >= 10) {
                int jinwei = numArr[i] / 10;
                numArr[i] = numArr[i] % 10;
                numArr[i+1] += jinwei;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numArr.length; i++) {
            result.append(numArr[i]);
        }

        int i = result.length() - 1;
        while (result.charAt(i) == '0' && i > 0) {
            result.deleteCharAt(i);
            i--;
        }

        return result.reverse().toString();
    }


}
