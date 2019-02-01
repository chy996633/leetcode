import static org.junit.Assert.*;

import org.junit.Test;

public class AtoiTest {

    @Test
    public void myAtoi() {

        Atoi atoi = new Atoi();
        assertEquals(42, atoi.myAtoi("42"));
        assertEquals(0, atoi.myAtoi(" "));
        assertEquals(-42, atoi.myAtoi("   -42"));
        assertEquals(4193, atoi.myAtoi("4193 with words"));
        assertEquals(-2147483648, atoi.myAtoi("-91283472332"));

    }
}