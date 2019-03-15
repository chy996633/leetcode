import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Test;

public class GenerateParenthesesTest {

    @Test
    public void solutions() {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        assertEquals(Arrays.asList("()"), generateParentheses.solutions(1));
        assertEquals(Arrays.asList("()()", "(())").size(), generateParentheses.solutions(2).size());
        assertEquals(Arrays.asList("()()()", "((()))", "()(())", "(())()", "(()())").size(), generateParentheses.solutions(3).size());
    }
}