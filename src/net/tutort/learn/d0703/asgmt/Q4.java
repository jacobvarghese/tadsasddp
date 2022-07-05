//Q4. You are given an array A of size N. You need to print elements of A in alternate order (starting
//from index 0).

package net.tutort.learn.d0703.asgmt;

public class Q4 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        for (int i = 0; i < a.length; i++) {
            if (i%2 == 0) { //find even indexes
                System.out.println(a[i]);
            }
        }
    }
}
