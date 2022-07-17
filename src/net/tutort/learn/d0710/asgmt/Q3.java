//771. https://leetcode.com/problems/jewels-and-stones/

package net.tutort.learn.d0710.asgmt;

public class Q3 {

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }

    private static int numJewelsInStones(String jewels, String stones) {
        char[] ch = stones.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (jewels.contains(Character.toString(ch[i])) ) count++;
        }
        return count;
    }
}
