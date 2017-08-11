package com.leetcode.easy.problem;

/**
 * Created by zhao on 2017/8/10.<br/>
 * Implement strStr().<br/>
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class Solution28 {

    public static void main(String[] args) {
        String haystack = "";
        String needle = "";
        System.out.println(new Solution28().strStr(haystack, needle));
    }

    private int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        if (m < n) return -1;
        for (int i = 0; i <= m - n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) return i;
        }
        return -1;
    }

}
