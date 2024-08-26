import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ZiFuChuanPaiXu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) {
            String str = in.nextLine();
            String res = sort(str);
            System.out.println(res);
        }
    }

    /**
     * 输入：字符串
     * 输出规则：
     * 1. 将字符串按英文字符A-Z排序，不区分大小写。对统一大小写的英文，按输入顺序排序
     * 2. 非英文字符，保持原位置不变
     *
     * 解题思路：从原字符串里挑出英文字符，定义比较器的排序规则：忽略大小写，使用一个队列保存排序后的结果。
     * 接着用两个指针，i j分别遍历原字符串和队列，把结果拼接到StringBuilder上。要注意的是非英文字符，还是从原字符串里找。
     *
     * @param str
     * @return
     */
    private static String sort(String str) {
        ArrayList<Character> letters = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                letters.add(c);
            }
        }
        letters.sort((o1, o2) -> Character.toLowerCase(o1) - Character.toLowerCase(o2));

        StringBuilder result = new StringBuilder();
        for (int i = 0, j = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                result.append(letters.get(j));
                j++;
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }


}
