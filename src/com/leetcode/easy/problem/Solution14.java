package com.leetcode.easy.problem;

/**
 * Created by zhaoz on 2017/8/9.<br/>
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
public class Solution14 {

    public static void main(String[] args) {
        String [] strs = {"abcdef", "abcefd", "abcedf", "abcd"};
        System.out.println(longestCommonPrefix(strs));
    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length ==0) return "";
        if (strs.length ==1) return strs[0];
        int length = Integer.MAX_VALUE;
        for (String str : strs) {
            length = (str.length() < length) ? str.length() : length;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            for (String str : strs) {
                if (str.charAt(i) != strs[0].charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }

}
