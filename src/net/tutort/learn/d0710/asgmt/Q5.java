//1550. https://leetcode.com/problems/three-consecutive-odds

package net.tutort.learn.d0710.asgmt;

public class Q5 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1};
        System.out.println(threeConsecutiveOdds(arr));
    }

    private static boolean threeConsecutiveOdds(int[] arr) {
        boolean threeOdds = true;
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]%2 != 0)  count++;
            else count = 0;
            if (count > 2) return threeOdds;
        }
        return !threeOdds ;
    }
}

