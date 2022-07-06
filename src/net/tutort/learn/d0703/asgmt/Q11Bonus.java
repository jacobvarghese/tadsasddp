//Given an array of even size N, task is to find minimum value that can be added to an element so that
//array become balanced. An array is balanced if the sum of the left half of the array elements is equal
//to the sum of right half.

package net.tutort.learn.d0703.asgmt;

public class Q11Bonus {
    public static void main(String[] args) {
        int[] a = {1, 5, 2, 4, 3, 10};
        int n = a.length;
        int lSum = 0, rSum = 0;

        if (n%2 != 0) {
            System.out.println("Array size needs to be even");
        } else {
            int m = n/2;
            for (int i = 0; i < m; i++) {
                lSum += a[i];
                rSum += a[m+i];
            }

            if ((lSum-rSum) < 0) {
                System.out.println("Add " + (rSum-lSum) + " to the left element to balance");
            } else {
                System.out.println("Add " + (lSum-rSum) + " to the right element to balance");
            }
        }
    }
}
