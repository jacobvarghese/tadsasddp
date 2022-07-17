//1672. https://leetcode.com/problems/richest-customer-wealth/

package net.tutort.learn.d0710.asgmt;

public class Q1 {
    public static void main(String[] args) {
        //int[][] accounts = {{1,2,3},{3,2,1}};
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int customerWealth= 0;
        int m = accounts.length;
        int n = accounts[0].length;

        for (int i = 0; i < m; i++) {
            int jSum = 0;
            for (int j = 0; j < n; j++) {
                jSum += accounts[i][j];
            }
            if (jSum > customerWealth) {
                customerWealth = jSum;
            }
        }

        return customerWealth;
    }
}
