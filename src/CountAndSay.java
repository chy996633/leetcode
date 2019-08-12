/**
 * @author <a herf="chenhy@itek-china.com">陈海越</a>
 * @version 1.0
 * @since 新标准版5.0
 *
 * <pre>
 * 历史：
 *      建立: 2019/8/11 陈海越
 *        </pre>
 */
public class CountAndSay {


    public static void main(String[] args) {

    }

    public String solution(Integer n) {
        String a = "1";
        for (int i = 1; i<n; i++) {
            a = genStr(a);
        }
        return a;
    }

    public String genStr(String input) {
        String output = "";
        Integer times = 1;
        char last = Character.MIN_VALUE, temp = last;
        for( char c : input.toCharArray() ) {
            temp = c;
            if (temp == last) {
                times ++;
            }else {
                if (last != Character.MIN_VALUE) {
                    output += (times.toString() + last);
                    times = 1;
                }
            }
            last = temp;
        }
        output += (times.toString() + temp);
        return output;
    }

}
