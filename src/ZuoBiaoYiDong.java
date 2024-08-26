import java.util.Scanner;

public class ZuoBiaoYiDong {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String input = in.nextLine();
            String[] split = input.split(";", 0);
            int x = 0, y = 0;
            for (String s : split) {
                // 非空校验
                if (s == null || s.equals("")) continue;
                if (!s.startsWith("A") && !s.startsWith("W") && !s.startsWith("S") && !s.startsWith("D")) continue;
                if (s.length() != 2 && s.length() != 3) continue;
                String subStr = s.substring(1, s.length());
                String forward = s.substring(0, 1);
                try {
                    int moveNum = Integer.parseInt(subStr);
                    if (forward.equals("A")) {
                        x = x - moveNum;
                    } else if (forward.equals("W")) {
                        y = y + moveNum;
                    } else if (forward.equals("D")) {
                        x = x + moveNum;
                    } else if (forward.equals("S")) {
                        y = y - moveNum;
                    }
                } catch (NumberFormatException e) {
                    continue;
                }
            }

            System.out.println(x + "," + y);
        }
    }

}
