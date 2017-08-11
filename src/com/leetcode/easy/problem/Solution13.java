package com.leetcode.easy.problem;

/**
 * Created by zhaoz on 2017/8/9.<br/>
 * Given a roman numeral, convert it to an integer.<br/>
 * Input is guaranteed to be within the range from 1 to 3999.<br/>
 *
 * 相同的数字连写，所表示的数等于这些数字相加得到的数，如 Ⅲ=3；<br/>
 * 小的数字在大的数字的右边，所表示的数等于这些数字相加得到的数，如 Ⅷ=8、Ⅻ=12；<br/>
 * 小的数字（限于 Ⅰ、X 和 C）在大的数字的左边，所表示的数等于大数减小数得到的数，如 Ⅳ=4、Ⅸ=9；<br/>
 */
public class Solution13 {

    public static void main(String[] args) {
        //String s = "DCXXI";//500+100+10+10+1
        String s = "MCMXCVI"; //1000+100-100-100+1000 -10+100+5+1
        // MCMXCVI是1996 也就是按照逻辑 遍历到C 的处理，MC先M+C，但是遍历到第二个M的时候，顺序是CM，这个时候要减去这个C以及之前多加的C，也就是减去两个C。
        System.out.println(romanToInt(s));
    }

    /*
     * 组合规则：
     * (1) 基本数字 Ⅰ、X 、C 中的任何一个，自身连用构成数目，或者放在大数的右边连用构成数目，都不能超过三个；放在大数的左边只能用一个。
     * (2) 不能把基本数字 V 、L 、D 中的任何一个作为小数放在大数的左边采用相减的方法构成数目；放在大数的右边采用相加的方式构成数目，只能使用一个。
     * (3) V 和 X 左边的小数字只能用 Ⅰ。
     * (4)L 和 C 左边的小数字只能用 ×。
     * (5)D 和 M 左 边的小数字只能用 C 。
     */

    private static int romanToInt(String s) {
        int result = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char pre = s.charAt(i-1);
            char c = s.charAt(i);
            if(getValue(c) > getValue(pre)){
                result = result + getValue(c) - 2*getValue(pre);
            }else{
                result += getValue(c);
            }
        }
        return result;
    }

    private static int getValue(char c){
        //Ⅰ（1）、V（5）、X（10）、L（50）、C（100）、D（500）、M（1000）
        switch (c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }

}
