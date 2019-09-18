import org.junit.Test;

import static org.junit.Assert.*;


public class MultipleStringsTest {

    @Test
    public void multiply() {

        assertEquals("121",  MultipleStrings.multiply("11", "11"));
        assertEquals("106704",  MultipleStrings.multiply("234", "456"));
        assertEquals("56088",  MultipleStrings.multiply("123", "456"));
        assertEquals("0",  MultipleStrings.multiply("123", "0"));

    }
}