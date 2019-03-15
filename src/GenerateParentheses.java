import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {



    public List<String> solutions(int n) {
        List<String> result = new ArrayList<>();
        if (n > 0) {
            traceback(result, 0, 0, "", n);
        }
        return result;
    }

    /**
     * find all possible solutions
     * @param result
     * @param left total left parentheses
     * @param right total right parentheses
     * @param out current output
     * @param max max
     */
    private void traceback(List<String> result, int left, int right, String out, int max) {
        if (out.length() ==  max * 2) {
            result.add(out);
            return;
        }

        if (left < max) {
            traceback(result, left + 1, right, out + "(", max);
        }

        if (right < left) {
            traceback(result, left, right + 1, out + ")", max);
        }

    }

}
