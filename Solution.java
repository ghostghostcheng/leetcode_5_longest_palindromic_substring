package leetcode_5_longest_palindromic_substring;

public class Solution {
    public static String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        String tmpStr = "";
        String resultStr = s.charAt(0) + "";
        
        for (int i = 0; i < s.length(); i++) {
            char tmpChar = s.charAt(i);
            if (i == s.length() - 1) {
                break;
            }
            
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == tmpChar) {
                    tmpStr = s.substring(i, j + 1);
                    
                    if (checkPalindromic(tmpStr)) {
                        if (tmpStr.length() > resultStr.length()) {
                            resultStr = tmpStr;
                        }    
                    }
                }
            }
        }
        return resultStr;
    }
    
    public static boolean checkPalindromic(String str) {
        String tmpStr = "";
        for (int i = str.length() - 1; i > 0; i--) {
            tmpStr = tmpStr + str.charAt(i);
        }
        tmpStr = tmpStr + str.charAt(0);
        if (tmpStr.equals(str)) {
            return true;
        }
        return false;
    }
}
