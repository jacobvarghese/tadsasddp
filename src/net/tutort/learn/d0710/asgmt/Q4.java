//1200. https://leetcode.com/problems/minimum-absolute-difference/

package net.tutort.learn.d0710.asgmt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q4 {
    public static void main(String[] args) {
        //int[] arr = { 4, 2, 1, 3};
        int[] arr = { 40, 11, 26, 27, -20};


        System.out.println(minAbsDiff(arr));

    }

    private static List<List<Integer>> minAbsDiff(int[] arr) {
        List<List<Integer>> solution= new ArrayList<>();
        Arrays.sort(arr);
        int minDiff = Math.abs(arr[1] - arr[0]);
        int k = 0;
        for (int i = 0; i < arr.length-1; i++) {
            int newDiff = Math.abs(arr[i+1] - arr[i]);
            if (minDiff == newDiff ) {
                solution.add(new ArrayList<>());
                solution.get(k).add(arr[i]);
                solution.get(k).add(arr[i+1]);
                k++;
            }else if(minDiff > newDiff ) {
                solution.clear();
                solution.add(new ArrayList<>());
                minDiff = newDiff;
                k = 0;
                solution.get(k).add(arr[i]);
                solution.get(k).add(arr[i+1]);
                k++;
            }else {
                continue;
            }
        }
        return solution;
    }
}
