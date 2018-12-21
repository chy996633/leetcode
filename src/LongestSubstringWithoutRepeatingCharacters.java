import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    /**
     * 暴力穷举法
     */
    public int lengthOfLongestSubstring(String s) {
        int i, j, max = 0;
        for (i = 0; i < s.length(); i++) {
            for (j = i; j < s.length(); j++) {
                if (allUnique(s, i, j)) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }

    public boolean allUnique(String s, int i, int j) {
        HashSet set = new HashSet();
        for (; i <= j; i++) {
            if (set.contains(s.charAt(i))) {
                return false;
            } else {
                set.add(s.charAt(i));
            }
        }
        return true;
    }

    /**
     * 窗口滑动法
     * 使用HashSet保存窗口中的字符
     */
    public int slideWindow(String s) {
        int i = 0, j = 0, max = 0, n = s.length();
        HashSet<Character> set = new HashSet();
        while ((i < n) && (j < n)) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }

    /**
     * 使用HashMap来保存已经读取的字符下标，当出现重复字符时，将i设置为从map中取出的该字符下标
     */
    public int hashMapSlide(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                //map中的index可能小于i当前位置
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

    /**
     * 假定s使用的字符集为ASCII， 使用int数组替代HashMap
     */
    public int intTableSlide(String s) {
        int n = s.length(), ans = 0;
        int[] table = new int[128];
        for (int i=0, j=0; j<n;j++ ) {
            i = Math.max(table[s.charAt(j)] , i);
            ans = Math.max(ans, j - i + 1);
            table[s.charAt(j)] = j + 1;
        }
        return ans;
    }

}
