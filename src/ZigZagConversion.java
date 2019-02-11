public class ZigZagConversion {

    public String convert(String s, int numRows) {
        if (numRows <= 1) return s;
        if (numRows == s.length()) return s;
        StringBuilder res = new StringBuilder();
        int x = 2 * numRows - 2;
        for (int i=0;i<numRows;i++) {
            for(int j=i;j<s.length();j +=x){
                res.append(s.charAt(j));
                int y = j + x - 2 * i;
                if (i != 0 && i != numRows-1 && y < s.length()) res.append(s.charAt(y));
            }
        }
        return res.toString();
    }

}
