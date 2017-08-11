package com.leetcode.problems;

/**
 * Created by zhao on 2017/8/10.<br/>
 * The count-and-say sequence is the sequence of integers with the first five terms as following:<br/>
 * 1.     1<br/>
 * 2.     11<br/>
 * 3.     21<br/>
 * 4.     1211<br/>
 * 5.     111221<br/>
 * 1 is read off as "one 1" or 11.<br/>
 * 11 is read off as "two 1s" or 21.<br/>
 * 21 is read off as "one 2, then one 1" or 1211.<br/>
 * Given an integer n, generate the nth term of the count-and-say sequence.<br/>
 * Note: Each term of the sequence of integers will be represented as a string.
 */
public class Solution38 {

    public static void main(String[] args) {
        //String s = "1211";
        //System.out.println(count(s));
        int n = 5;
        System.out.println(countAndSay(n));
    }

    private static String countAndSay(int n) {
        String result = "1";
        if (n == 1) return result;
        int num = 2;
        while (num <= n) {
            result = count(result);
            num++;
        }
        return result;
    }

    private static String count(String s) {
        String result = "";
        int count = 0;
        char c = '0';
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (count != 0 && s.charAt(i - 1) != c) {
                result = result + count + s.charAt(i - 1);
                count = 0;
            }
            count++;
        }
        result = result + count + c;
        return result;
    }

}
