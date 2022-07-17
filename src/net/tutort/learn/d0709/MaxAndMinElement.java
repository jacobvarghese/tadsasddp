package net.tutort.learn.d0709;

import java.util.Arrays;

public class MaxAndMinElement {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 2, 3};
        if (a.length > 1) {
            System.out.println(Arrays.toString(findMaxMin(a)));
        }
    }

    private static int[] findMaxMin(int[] a) {
    int[] maxMin = {0, 0};
        Arrays.sort(a);
        maxMin[0] = a[0];
        maxMin[1] = a[a.length - 1];
    return maxMin;
    }
}
