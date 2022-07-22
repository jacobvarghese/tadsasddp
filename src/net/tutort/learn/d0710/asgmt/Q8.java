// 283 https://leetcode.com/problems/move-zeroes/

package net.tutort.learn.d0710.asgmt;

import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }

    private static int[] moveZeroes(int[] nums) {
        int j =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            } else {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i < nums.length ; i++) {
            nums[i] = 0;
        }
        return nums;
    }
}
