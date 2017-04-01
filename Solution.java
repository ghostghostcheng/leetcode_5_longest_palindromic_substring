package leetcode_5_longest_palindromic_substring;

public class Solution {
    public static String longestPalindrome(String s) {
    	String resultStr = "";
    	for (int i = 0; i < s.length(); i++) {
		int tailIdx = s.length() - 1, counter = 0, j = s.length() - 1;
		for (; j > -1 && tailIdx > -1;) {
			if (resultStr.length() > (j - i + 1)) {
				break;
			}
			else if (tailIdx - i >= 0 && s.charAt(i + counter) == s.charAt(tailIdx)) {
				tailIdx = (counter != 0) ? tailIdx : j;
				resultStr = (tailIdx - i != 0) ? resultStr : s.substring(i, j + 1);
				counter = (tailIdx - i != 0) ? ++counter : 0;
				tailIdx--;
				continue;
			} else {
				counter = 0;
				tailIdx = --j;
			}
		}
    	}
    	return resultStr;
    }  
}
