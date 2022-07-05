//Q7. Given an array of length N, at each step it is reduced by 1 element. In the first step the maximum
//element would be removed, while in the second step minimum element of the remaining array would
//be removed, in the third step again the maximum and so on. Continue this till the array contains only 1
//element. And find the final element remaining in the array

package net.tutort.learn.d0703.asgmt;

public class Q7 {
    public static void main(String[] args) {
        int[] a =  {7, 8, 3, 4, 2, 9, 5};
        int n = a.length;
        int index = 0;
        boolean max = true;

        //System.out.println(Arrays.toString(a));

        if (n > 1) {
            //Find index with max/min value
            while (a.length > 1) {
                for (int i = 0; i < n ; i++) {
                    if (max) {
                        index = findIndex(a, true);
                        max=false;
                    } else {
                        index = findIndex(a, false);
                        max=true;
                    }
                }

                //remove the array and update the array.
                a = remove_element(a, index);
                //System.out.println(Arrays.toString(a));
            }
            System.out.println(a[0]);
        } else {
            System.out.println(a[0]);
        }
    }

    public static int findIndex (int[] arr, boolean max) {
        if (max) {
            int max_value = arr[0];
            int max_value_index = 0;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max_value) {
                    max_value = arr[i];
                    max_value_index = i;
                }
            }
            return max_value_index;
        } else {
            int min_value = arr[0];
            int min_value_index = 0;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min_value) {
                    min_value = arr[i];
                    min_value_index = i;
                }
            }
            return min_value_index;
        }
    }

    public static int[] remove_element (int[] arr, int index) {
        if (arr.length < 2) {
            return arr;
        }

        int[] updatedArr = new int[arr.length - 1];

        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            } else {
                updatedArr[k++] = arr[i];
            }
        }
        return updatedArr;
    }
}
