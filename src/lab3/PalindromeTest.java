package lab3;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    @org.junit.jupiter.api.Test
    public void isPalindrome() {

        assertEquals(Palindrome.isPalindrome(121), true);
    }

    @Test
    public void isNotPalindrome() {
        assertEquals(Palindrome.isPalindrome(12212), false);
    }

    @Test
    public void isNegativePalindrome() {
        assertFalse(Palindrome.isPalindrome(-121));
    }
}