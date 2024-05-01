package abhi.practice.arrays.hard.FindRepetedAndMissingNumers;


import java.util.Arrays;

/**
 * Problem Statement: You are given a read-only array of N
 * integers with values also in the range [1, N] both inclusive.
 * Each integer appears exactly once except A which appears
 * twice and B which is missing. The task is to find the
 * repeating and missing numbers A and B where A repeats twice and B is missing.
 */
public class Solution3 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findNumbers(new int[]{3, 1, 2, 5, 3})));
        System.out.println(Arrays.toString(findNumbers(new int[]{3, 1, 2, 5, 4, 6, 7, 5})));
    }

    private static int[] findNumbers(int[] a) {
        int n = a.length; // size of the array
        int xr = 0;

        //Step 1: Find XOR of all elements:
        for (int i = 0; i < n; i++) {
            xr = xr ^ a[i];
            xr = xr ^ (i + 1);
        }

        //Step 2: Find the differentiating bit number:
        int number = (xr & -xr);

        //Step 3: Group the numbers:
        int zero = 0;
        int one = 0;
        for (int i = 0; i < n; i++) {
            //part of 1 group:
            if ((a[i] & number) != 0) {
                one = one ^ a[i];
            }
            //part of 0 group:
            else {
                zero = zero ^ a[i];
            }
        }

        for (int i = 1; i <= n; i++) {
            //part of 1 group:
            if ((i & number) != 0) {
                one = one ^ i;
            }
            //part of 0 group:
            else {
                zero = zero ^ i;
            }
        }

        // Last step: Identify the numbers:
        int cnt = 0;
        for (int j : a) {
            if (j == zero) cnt++;
        }

        if (cnt == 2) return new int[]{zero, one};
        return new int[]{one, zero};
    }
}
