import static org.junit.Assert.*;

import org.junit.Test;

public class LettersOfPhoneNumberCombinationsTest {

    @Test
    public void solutions() {
        LettersOfPhoneNumberCombinations letters = new LettersOfPhoneNumberCombinations();
        assertEquals(new String[]{"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"}, letters.solutions("23").toArray());

    }

    @Test
    public void solutionTwo() {
        LettersOfPhoneNumberCombinations letters = new LettersOfPhoneNumberCombinations();
        assertArrayEquals(new String[]{"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"}, letters.solutionTwo("23").toArray());
    }
}