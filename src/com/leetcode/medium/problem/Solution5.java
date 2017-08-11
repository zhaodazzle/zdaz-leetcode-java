package com.leetcode.medium.problem;

/**
 * Created by zhao on 2017/8/11.<br/>
 * <p>
 * Problem 5. Longest Palindromic Substring
 * <p/>
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 * <p/>
 * Example:<br/>
 * Input: "babad"<br/>
 * Output: "bab"<br/>
 * Note: "aba" is also a valid answer.<br/>
 * Example:<br/>
 * Input: "cbbd"<br/>
 * Output: "bb"
 */
public class Solution5 {

    public static void main(String[] args) {
        String s = "cbbd";
        s = "jrjnbctoqgzimtoklkxcknwmhiztomaofwwzjnhrijwkgmwwuazcowskjhitejnvtblqyepxispasrgvgzqlvrmvhxusiqqzzibcyhpnruhrgbzsmlsuacwptmzxuewnjzmwxbdzqyvsjzxiecsnkdibudtvthzlizralpaowsbakzconeuwwpsqynaxqmgngzpovauxsqgypinywwtmekzhhlzaeatbzryreuttgwfqmmpeywtvpssznkwhzuqewuqtfuflttjcxrhwexvtxjihunpywerkktbvlsyomkxuwrqqmbmzjbfytdddnkasmdyukawrzrnhdmaefzltddipcrhuchvdcoegamlfifzistnplqabtazunlelslicrkuuhosoyduhootlwsbtxautewkvnvlbtixkmxhngidxecehslqjpcdrtlqswmyghmwlttjecvbueswsixoxmymcepbmuwtzanmvujmalyghzkvtoxynyusbpzpolaplsgrunpfgdbbtvtkahqmmlbxzcfznvhxsiytlsxmmtqiudyjlnbkzvtbqdsknsrknsykqzucevgmmcoanilsyyklpbxqosoquolvytefhvozwtwcrmbnyijbammlzrgalrymyfpysbqpjwzirsfknnyseiujadovngogvptphuyzkrwgjqwdhtvgxnmxuheofplizpxijfytfabx";//超时了
        //System.out.println(new Solution5().isPalindrome(s));
        System.out.println(new Solution5().longestPalindrome(s));
    }

    private String longestPalindrome(String s) {
        int maxlen = 0;
        String maxStr = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j < s.length() - i + 1; j++) {
                String str = s.substring(i, i + j);
                if (isPalindrome(str) && str.length() > maxlen) {
                    maxlen = str.length();
                    maxStr = str;
                }
            }
        }
        return maxStr;
    }

    private boolean isPalindrome(String s) {
        if (s == null || "".equals(s)) return false;
        boolean flag = true;
        for (int i = 0; i < s.length() / 2; i++) {
            char a = s.charAt(i);
            char b = s.charAt(s.length() - i - 1);
            if (a != b) {
                flag = false;
            }
        }
        return flag;
    }

}
