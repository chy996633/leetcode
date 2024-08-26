import java.util.ArrayList;
import java.util.Arrays;

public class Calculate24Point {

    /**
     * 算24点游戏
     * 深度优先 递归思路：列表中取两个数，进行四则运算，拿运算结果跟列表剩余数 继续算24点
     *
     * 问题：四个数，选择两个进行四则运算，拿运算结果跟剩余数计算，得到24
     * 子问题：在剩余数中，继续递归
     *
     * @param args
     */
    public static void main(String[] args) {

        ArrayList<Integer> input = new ArrayList<>();
        input.addAll(Arrays.asList(7,2,1,10));

        Calculate24Point calculate24Point = new Calculate24Point();
//        boolean result = calculate24Point.dfs(input, 0);
//        System.out.println(result);

        boolean result = calculate24Point.dfs2(input);
        System.out.println(result);
    }

    /**
     * 递归函数
     * @param list 待递归数列表
     * @param caluNum 上次运算结果
     * @return
     */
    boolean dfs(ArrayList<Integer> list, int caluNum) {
        // 递归终止条件。待递归数列表 为空时，取前次运算结果是否为24点
        if (list.size() == 0) {
            return caluNum == 24;
        }

        ArrayList<Integer> copyList = new ArrayList<>(list);
        // 将上次结果入列。首次运算除外
        if (list.size() != 4) {
            copyList.add(caluNum);
        }

        // 从list中取两个数，进行四则运算，拿运算结果跟list中剩余数继续递归
        int n = copyList.size();
        // 子递归结果作 或运算，只要有一次成功就算成功
        boolean isValid = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                ArrayList<Integer> temp = new ArrayList<>(copyList);
                Integer ni = temp.get(i);
                Integer nj = temp.get(j);
                temp.remove(ni);
                temp.remove(nj);

                isValid = isValid || dfs(temp, ni + nj);
                isValid = isValid || dfs(temp, ni - nj);
                isValid = isValid || dfs(temp, nj - ni);
                isValid = isValid || dfs(temp, ni * nj);

                if (nj != 0 && ni % nj == 0) {
                    isValid = isValid || dfs(temp, ni / nj);
                }

                if (ni != 0 && nj % ni == 0) {
                    isValid = isValid || dfs(temp, nj / ni);
                }

                // 递归得到正确结果，直接返回
                if (isValid) {
                    return true;
                }
            }
        }

        return false;
    }


    /**
     * 递归函数
     * @param list 待递归数列表
     * @return
     */
    boolean dfs2(ArrayList<Integer> list) {
        // 递归终止条件。待递归数列表只剩一个，判断是否为24点
        if (list.size() == 1) {
            return list.get(0) == 24;
        }

        // 从list中取两个数，进行四则运算，拿运算结果跟list中剩余数继续递归
        int n = list.size();
        // 子递归结果作 或运算，只要有一次成功就算成功
        boolean isValid = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                ArrayList<Integer> temp = new ArrayList<>(list);
                Integer nj = temp.remove(j);
                Integer ni = temp.remove(i);

                temp.add(ni + nj);
                isValid = isValid || dfs2(temp);

                temp.set(temp.size() - 1, ni - nj);
                isValid = isValid || dfs2(temp);

                temp.set(temp.size() - 1, nj - ni);
                isValid = isValid || dfs2(temp);

                temp.set(temp.size() - 1, ni * nj);
                isValid = isValid || dfs2(temp);

                if (nj != 0 && ni % nj == 0) {
                    temp.set(temp.size() - 1, ni / nj);
                    isValid = isValid || dfs2(temp);
                }

                if (ni != 0 && nj % ni == 0) {
                    temp.set(temp.size() - 1, nj / ni);
                    isValid = isValid || dfs2(temp);
                }

                // 递归得到正确结果，直接返回
                if (isValid) {
                    return true;
                }
            }
        }

        return false;
    }

}
