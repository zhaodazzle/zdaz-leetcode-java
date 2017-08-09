package com.leetcode.problems;

/**
 * Created by zhaoz on 2017/8/9.<br/>
 * problem description:<br/>
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.<br/>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.<br/>
 *
 */
public class Solution1 {

    public static void main(String[] args) {
        int [] nums = {2, 7, 11, 15};
        int target = 9;
        int [] result = twoSum(nums, target);
        System.out.println(result[0] + " "+ result[1]);
    }

    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int other = target - nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] == other){
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{0, 0};
    }

}
