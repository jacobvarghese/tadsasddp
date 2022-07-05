//Q6. Given an array of size N and you have to tell whether the array is perfect or not. An array is said
//to be perfect if it's reverse array matches the original array. If the array is perfect then print
//"PERFECT" else print "NOT PERFECT"

package net.tutort.learn.d0703.asgmt;

public class Q6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 2, 1};
        boolean perfect = true;

        for (int i = 0; i < (arr.length / 2); i++) {
            int j = (arr.length - 1) - i;
            if (arr[i] != arr[j]) {
                perfect = false;
                break;
            }
        }
        if (perfect) System.out.println("PERFECT");
        else System.out.println("NOT PERFECT");
    }
}
