package com.leetcode.problems;

/**
 * Created by zhao on 2017/8/10.<br/>
 * Given an array and a value, remove all instances of that value in place and return the new length.<br/>
 * Do not allocate extra space for another array, you must do this in place with constant memory.<br/>
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.<br/>
 * Example:<br/>
 * Given input array nums = [3,2,2,3], val = 3<br/>
 * Your function should return length = 2, with the first two elements of nums being 2.
 */
public class Solution27 {

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        System.out.println(new Solution27().removeElement(nums, 3));
    }

    private int removeElement(int[] nums, int val) {
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[len] = nums[i];
                len++;
            }
        }
        return len;
    }

}
