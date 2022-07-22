//169. https://leetcode.com/problems/majority-element/

package net.tutort.learn.d0710.asgmt;

import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }

    private static int majorityElement(int[] nums) {
        int point = nums.length / 2;
        Arrays.sort(nums);

        int num = nums[0];
        int num_count = 0;

        int max = 0;
        int max_count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != num)  {
                num = nums[i];
                num_count = 1;
            } else if (nums[i] == num) {
                num_count++;
            } else {
                continue;
            }
            if (num_count > max_count) {
                max = num;
                max_count = num_count;
            }
            if (max_count > point) {
                break;
            }
        }
        return max;
    }
}
