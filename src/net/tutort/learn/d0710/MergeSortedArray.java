package net.tutort.learn.d0710;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] a1 = {1, 2,  7, 10};
        int[] a2 = {4, 5, 8, 20, 30, 40};
        System.out.println(Arrays.toString(mergeArrays(a1, a2)));
    }

    private static int[] mergeArrays(int[] a1, int[] a2) {
        int[] a3 = new int[a1.length + a2.length];
        int i = 0, j = 0, k = 0;

        //compare arrays until the end of one of the arrays
        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j]) {
                a3[k] = a1[i];
                i++;
            } else {
                a3[k] = a2[j];
                j++;
            }
            k++;
        }
        //copy remaining sorted elements
        while (i < a1.length) {
            a3[k] = a2[i];
            j++; k++;
        }

        while (j < a2.length) {
            a3[k] = a2[j];
            j++; k++;
        }
        return a3;
    }
}
