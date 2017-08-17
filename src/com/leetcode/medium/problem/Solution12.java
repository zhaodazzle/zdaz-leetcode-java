package com.leetcode.medium.problem;

/**
 * Created by zhao on 2017/8/17.<br/>
 * Given an integer, convert it to a roman numeral.<br/>
 * Input is guaranteed to be within the range from 1 to 3999.
 */
public class Solution12 {

    public static void main(String[] args) {
        int num = 1357;
        System.out.println(new Solution12().intToRoman(num));
    }

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int[] aArray = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] rArray = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < aArray.length; i++) {
            while (num >= aArray[i]) {
                num -= aArray[i];
                sb.append(rArray[i]);
            }
        }
        return sb.toString();
    }

}
