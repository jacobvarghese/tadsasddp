//1480 https://leetcode.com/problems/running-sum-of-1d-array/

package net.tutort.learn.d0710.asgmt;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(a1)));
    }
    public static int[] runningSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                nums[i] += nums[i-1];
            }
        }
        return nums;
    }
}
