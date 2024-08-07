package org.gaurav.leetcode75;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Subsequence1Test {

    @Test
    void isSubsequence_whenSubsequenceExists_returnsTrue() {
        Subsequence1 subsequence1 = new Subsequence1();
        assertTrue(subsequence1.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    void isSubsequence_whenSubsequenceDoesNotExist_returnsFalse() {
        Subsequence1 subsequence1 = new Subsequence1();
        assertFalse(subsequence1.isSubsequence("axc", "ahbgdc"));
    }

    @Test
    void isSubsequence_whenInputStringsAreEmpty_returnsTrue() {
        Subsequence1 subsequence1 = new Subsequence1();
        assertTrue(subsequence1.isSubsequence("", ""));
    }

    @Test
    void isSubsequence_whenSubsequenceIsEmpty_returnsTrue() {
        Subsequence1 subsequence1 = new Subsequence1();
        assertTrue(subsequence1.isSubsequence("", "ahbgdc"));
    }

    @Test
    void isSubsequence_whenMainStringIsEmpty_returnsFalse() {
        Subsequence1 subsequence1 = new Subsequence1();
        assertFalse(subsequence1.isSubsequence("abc", ""));
    }
}