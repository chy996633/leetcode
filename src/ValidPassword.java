public class ValidPassword {


    public static void verify(String[] passwordArray) {

        for (String s : passwordArray) {
            if (!verify1(s) || !verify2(s) || !verify3(s, 1, 4)) {
                System.out.println("NG");
            } else {
                System.out.println("OK");
            }
        }

    }

    // 判断密码长度大于8
    public static boolean verify1(String str) {
        if (str.length() > 8 ) {
            return true;
        }

        return false;
    };

    // 判断密码复杂度 包含大写字母、小写字母、 数字、 其他符号  四种包含三种
    public static boolean verify2(String str) {
        int count = 0;
        if (str.matches(".*[0-9].*")) {
            count++;
        }
        if (str.matches(".*[A-Z].*")) {
            count++;
        }
        if (str.matches(".*[a-z].*")) {
            count++;
        }
        if (str.matches(".*[^a-zA-Z0-9].*")) {
            count++;
        }

        if (count >= 3) {
            return true;
        }

        return false;
    };

    // 判断不存在长度2以上的重复子串
    public static boolean verify3(String str, int l, int r) {
        // 递归终止条件
        if (r == str.length()) return true;

        if (str.substring(r).contains(str.substring(l, r))) {
            return false;
        } else {
            return verify3(str, l+1, r+1);
        }
    };


}
