package com.leetcode.medium.problem;

/**
 * Created by zhao on 2017/8/17.<br/>
 * <p>
 * Problem 11. Container With Most Water<br/>
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.<br/>
 * Note: You may not slant the container and n is at least 2.
 */
public class Solution11 {

    public static void main(String[] args) {
        int[] height = new int[]{1, 3, 5};
        System.out.println(new Solution11().maxArea(height));
    }

    private int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = 0;
        while (left != right) {
            int area = (right - left) * (height[left] < height[right] ? height[left] : height[right]);
            result = area > result ? area : result;
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }

}
