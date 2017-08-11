package com.leetcode.easy.problem;

/**
 * Created by zhaoz on 2017/8/9.<br/>
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class Solution9 {

    public static void main(String[] args) {
        int x = 123321;
        System.out.println(isPalindrome(x));
    }

    private static boolean isPalindrome(int x) {
        if(x<0) return false;//负数不是回文字
        int reserve = 0;
        int origin = x;
        while(x>0){
            reserve = reserve*10 + x%10;
            x/=10;
        }
        return reserve == origin;
    }

}
