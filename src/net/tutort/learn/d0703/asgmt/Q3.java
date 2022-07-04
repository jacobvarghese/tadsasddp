//Q3. Given an sorted array A of size N. Find number of elements which are less than or equal to given
//element X.

package net.tutort.learn.d0703.asgmt;

public class Q3 {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 5, 8, 10}; //sorted array
        int x = 9;
        int count = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] <= 9) {
                count++;
            } else break; //rest of the numbers are greater than 'x'
        }
        System.out.println(count);
    }
}
