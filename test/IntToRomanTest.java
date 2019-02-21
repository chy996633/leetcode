import static org.junit.Assert.*;

import org.junit.Test;

public class IntToRomanTest {

    @Test
    public void solution() {
        IntToRoman itr = new IntToRoman();
        assertEquals("III", itr.solution(3));
        assertEquals("IV", itr.solution(4));
        assertEquals("LVIII", itr.solution(58));
        assertEquals("MCMXCIV", itr.solution(1994));
        assertEquals("IX", itr.solution(9));
        assertEquals("XL", itr.solution(40));
        assertEquals("CD", itr.solution(400));
    }
}