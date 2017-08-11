package com.leetcode.easy.problem;

/**
 * Created by zhao on 2017/8/10.<br/>
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.<br/>
 * Do not allocate extra space for another array, you must do this in place with constant memory.<br/>
 * For example,<br/>
 * Given input array nums = [1,1,2],<br/>
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 */
public class Solution26 {

    public static void main(String[] args) {
        int [] nums = {1,1,2,3,3};
        System.out.println(new Solution26().removeDuplicates(nums));
    }

    private int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        int len = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[i-1]){
                len+=1;
                nums[len-1] = nums[i];//需要更新原始的nums对象
            }
        }
        return len;
    }

}
