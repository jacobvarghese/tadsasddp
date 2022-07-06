//Q10. Given a number N. Your task is to check whether it is fascinating or not.
//Fascinating Number: When a number(should contain 3 digits or more) is multiplied by 2 and 3 ,and
//when both these products are concatenated with the original number, then it results in all digits from 1
//to 9 present exactly once.

package net.tutort.learn.d0703.asgmt;

public class Q10 {
    public static void main(String[] args) {
        Integer n = 192;
        int[] checker = new int[9];
        boolean isFacng = true;

        //System.out.println(Arrays.toString(checker));

        Integer n2 = n * 2;
        Integer n3 = n * 3;
        String n_facng = n.toString() + n2.toString() + n3.toString();

        for (int i = 0; i < n_facng.length(); i++) {
            checker[Character.getNumericValue(n_facng.charAt(i)) -1] += 1;
        }

        //System.out.println(Arrays.toString(checker));

        for (int i = 0; i < checker.length; i++ ) {
            if (checker[i] == 1) {
                continue;
            } else {
                System.out.println("Not Facinating");
                isFacng = false;
                break;
            }
        }

        if (isFacng) System.out.println("Facinating");
    }
}
