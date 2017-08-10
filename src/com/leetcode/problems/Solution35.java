package com.leetcode.problems;

/**
 * Created by zhao on 2017/8/10.<br/>
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.<br/>
 * You may assume no duplicates in the array.<br/>
 * Here are few examples.<br/>
 * [1,3,5,6], 5 → 2<br/>
 * [1,3,5,6], 2 → 1<br/>
 * [1,3,5,6], 7 → 4<br/>
 * [1,3,5,6], 0 → 0
 */
public class Solution35 {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(new Solution35().searchInsert(nums, 0));
    }

    private int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return (nums[0] >= target) ? 0 : 1;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result = i;
                break;
            } else if (nums[i] < target) {
                result = i+1;
            }
        }
        return result;
    }

}
