package com.leetcode.medium.problem;

import java.util.HashMap;

/**
 * Created by zhao on 2017/8/11.<br/>
 * <p>
 * Problem 3. Longest Substring Without Repeating Characters
 * <p/>
 * Given a string, find the length of the longest substring without repeating characters.<br/>
 * Examples:<br/>
 * Given "abcabcbb", the answer is "abc", which the length is 3.<br/>
 * Given "bbbbb", the answer is "b", with the length of 1.<br/>
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class Solution3 {

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(new Solution3().lengthOfLongestSubstring(s));
    }

    private int lengthOfLongestSubstring(String s) {
        int len = 0;
        int removeIndex = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                len = (len > map.size()) ? len : map.size();
                while (map.containsKey(c)) {
                    map.remove(s.charAt(removeIndex));
                    removeIndex++;
                }
                map.put(c, i);
            } else {
                map.put(c, i);
            }
        }

        len = (len > map.size()) ? len : map.size();
        return len;
    }

}
