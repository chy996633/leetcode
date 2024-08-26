import org.junit.Test;

import static org.junit.Assert.*;

public class ValidPasswordTest {

    @Test
    public void verify() {

        String[] testCase = new String[] {
                "021Abc9000",
                "021Abc9Abc1",
                "021ABC9000",
                "021$bc9000",
                "Q~7T&(4^$OXz725(3!Xl(3+s*"
        };

        ValidPassword.verify(testCase);
    }
}