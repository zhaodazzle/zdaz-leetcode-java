package com.leetcode.medium.problem;

/**
 * Created by zhao on 2017/8/14.
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)<br/>
 * P   A   H   N<br/>
 * A P L S I I G<br/>
 * Y   I   R<br/>
 * And then read line by line: "PAHNAPLSIIGYIR"<br/>
 * Write the code that will take a string and make this conversion given a number of rows:<br/>
 * string convert(string text, int nRows);<br/>
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */
public class Solution6 {

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(new Solution6().convert(s, numRows));
    }

    private String convert(String s, int numRows) {
        if (s == null || numRows <= 1) return s;
        int len = s.length();
        if (len <= numRows) return s;

        final int N = 2 * numRows - 2;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            char ch;
            for (int j = i; j < len; j += N) {
                ch = s.charAt(j);
                sb.append(ch);
                if (i != 0 && i != numRows - 1) {//如果是中间元素单独处理
                    int tmp = j + N - 2 * i;
                    if (tmp < len) {
                        ch = s.charAt(tmp);
                        sb.append(ch);
                    }
                }
            }
        }
        return sb.toString();
    }

}
