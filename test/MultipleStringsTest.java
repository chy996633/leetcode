import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author <a herf="chenhy@itek-china.com">陈海越</a>
 * @version 1.0
 * @since 新标准版5.0
 *
 * <pre>
 * 历史：
 *      建立: 2019/9/6 陈海越
 *        </pre>
 */
public class MultipleStringsTest {

    @Test
    public void multiply() {

        assertEquals("121",  MultipleStrings.multiply("11", "11"));
        assertEquals("106704",  MultipleStrings.multiply("234", "456"));
        assertEquals("56088",  MultipleStrings.multiply("123", "456"));
        assertEquals("0",  MultipleStrings.multiply("123", "0"));

    }
}