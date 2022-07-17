package net.tutort.learn.d0709;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        char[] a = {'i', 'a', 'm'};
        System.out.println(Arrays.toString(reverse(a)));
    }

    private static char[] reverse(char[] a) {
        char[] reverse = new char[a.length];

        //TODO handle zero array

        for (int i = 0, j = a.length-1; i < a.length; i++, j--)  {
            reverse[i] = a[j];
        }
        return reverse;
    }
}
