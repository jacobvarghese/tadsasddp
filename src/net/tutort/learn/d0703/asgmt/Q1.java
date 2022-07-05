// Q1. Given an array of N integers. Your task is to print the sum of the integers.

package net.tutort.learn.d0703.asgmt;

public class Q1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum+= a[i];
        }

        System.out.println(sum);
    }
}
