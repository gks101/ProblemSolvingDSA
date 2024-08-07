package org.gaurav.leetcode75;

public class Subsequence1 {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        if (s.length() > t.length()) {
            return false;
        }
        for(;i < s.length();i++) {
            char ch = s.charAt(i);
            for (;j < t.length();j++) {
                if (t.charAt(j) == ch) {
                    j++;
                    break;
                }
            }
            if (ch != t.charAt(j - 1)) {
                return false;
            }
        }

        return i == s.length();
    }
}
