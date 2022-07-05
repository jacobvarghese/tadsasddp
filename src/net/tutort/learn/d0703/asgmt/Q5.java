//Q5. Given an array Arr of N positive integers. Your task is to find the elements whose value is equal
//to that of its index value ( Consider 1-based indexing ).

package net.tutort.learn.d0703.asgmt;

public class Q5 {
    public static void main(String[] args) {
        int[] a = {15, 2, 45, 4, 7};

        for (int i = 0; i < a.length; i++) {
            if (a[i] == (i+1)) {
                System.out.println(i+1);
            }
        }
    }
}
