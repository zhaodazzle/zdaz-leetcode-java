package com.leetcode.problems;

/**
 * Created by zhaoz on 2017/8/9.<br/>
 * Reverse digits of an integer.
 */
public class Solution7 {

    public static void main(String[] args) {
        int x = -123;
        System.out.println(reverse(x));
    }

    private static int reverse(int x) {
        int result = 0;
        while(x!=0){
            int n = x%10;
            //超过int范围返回0，不能在下一个result计算之后，因为下一个result计算就会超出范围，结果已经变化
            if(result>Integer.MAX_VALUE/10 || result< Integer.MIN_VALUE/10){
                return 0;
            }
            result = result * 10 + n;
            x/=10;
        }
        return result;
    }

}
