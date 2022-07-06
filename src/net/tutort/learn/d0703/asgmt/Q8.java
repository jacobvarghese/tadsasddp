//Q8. Given an array of N distinct elements, the task is to find all elements in array except two greatest
//elements in sorted order.

package net.tutort.learn.d0703.asgmt;

import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        int[] a = {7, -2, 3, 4, 9, -1};
        Arrays.sort(a);

        for (int i = 0; i < a.length - 2; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
