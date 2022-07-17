package net.tutort.learn.d0709;

public class MaxElement {
    public static void main(String[] args) {
        int[] a = {12, 34, 2, 66};

        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
       }
        System.out.println(max);
    }
}
