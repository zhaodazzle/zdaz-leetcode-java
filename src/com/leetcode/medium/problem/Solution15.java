package com.leetcode.medium.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhao on 2017/8/17.<br/>
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.<br/>
 * Note: The solution set must not contain duplicate triplets.<br/>
 * For example, given array S = [-1, 0, 1, 2, -1, -4],<br/>
 * A solution set is:<br/>
 * [<br/>
 * [-1, 0, 1],<br/>
 * [-1, -1, 2]<br/>
 * ]
 */
public class Solution15 {

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(new Solution15().threeSum(nums));
    }

    private List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        if (len < 3) return result;
        Arrays.sort(nums);

        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int begin = i + 1, end = len - 1;
            while (begin < end) {
                int sum = nums[i] + nums[begin] + nums[end];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[begin], nums[end]));
                    begin++;
                    end--;
                    while (begin < end && nums[begin] == nums[begin - 1]) begin++;
                    while (begin < end && nums[end] == nums[end + 1]) end--;
                } else if (sum > 0) end--;
                else begin++;
            }
        }

        return result;
    }

}
