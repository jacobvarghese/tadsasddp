//Q9. Write a program to find the sum of the given series 1+2+3+ . . . . . .(N terms)

package net.tutort.learn.d0703.asgmt;

public class Q9 {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;

        while (n >= 0) {
            sum += n;
            n--;
        }
        System.out.println(sum);
    }

}
