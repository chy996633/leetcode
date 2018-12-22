import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void lengthOfLongestSubstring() {
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
        Assert.assertEquals(3, l.slideWindow("abc"));
        Assert.assertEquals(3, l.slideWindow("abcabcbb"));
        Assert.assertEquals(1, l.slideWindow("bbbbb"));
        Assert.assertEquals(3, l.slideWindow("pwwkew"));


        Assert.assertEquals(3, l.hashMapSlide("abc"));
        Assert.assertEquals(3, l.hashMapSlide("abcabcbb"));
        Assert.assertEquals(1, l.hashMapSlide("bbbbb"));
        Assert.assertEquals(3, l.hashMapSlide("pwwkew"));
        Assert.assertEquals(2, l.hashMapSlide("aab"));
        Assert.assertEquals(5, l.hashMapSlide("tmmzuxt"));
    }
}