import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author <a herf="chenhy@itek-china.com">陈海越</a>
 * @version 1.0
 * @since 新标准版5.0
 *
 * <pre>
 * 历史：
 *      建立: 2019/8/11 陈海越
 *        </pre>
 */
public class CountAndSayTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void genStr() {

        CountAndSay cas = new CountAndSay();
        assertEquals("11", cas.genStr("1"));
        assertEquals("21", cas.genStr("11"));
        assertEquals("1211", cas.genStr("21"));
        assertEquals("111221", cas.genStr("1211"));
        assertEquals("312211", cas.genStr("111221"));

    }


    @Test
    public void solution() {
        CountAndSay cas = new CountAndSay();
        assertEquals("1", cas.solution(1));
        assertEquals("11", cas.solution(2));
        assertEquals("21", cas.solution(3));
        assertEquals("1211", cas.solution(4));
        assertEquals("111221", cas.solution(5));
        assertEquals("312211", cas.solution(6));

    }
}