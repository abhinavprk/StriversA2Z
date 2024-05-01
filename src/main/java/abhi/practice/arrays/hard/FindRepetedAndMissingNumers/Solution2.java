package abhi.practice.arrays.hard.FindRepetedAndMissingNumers;


import java.util.Arrays;

/**
 * Problem Statement: You are given a read-only array of N
 * integers with values also in the range [1, N] both inclusive.
 * Each integer appears exactly once except A which appears
 * twice and B which is missing. The task is to find the
 * repeating and missing numbers A and B where A repeats twice and B is missing.
 */
public class Solution2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findNumbers(new int[]{3, 1, 2, 5, 3})));
        System.out.println(Arrays.toString(findNumbers(new int[]{3, 1, 2, 5, 4, 6, 7, 5})));
    }

    private static int[] findNumbers(int[] nums) {
        int len = nums.length;
        long sn = ((long) len *(len+1))/2;
        long s2n = ((long) len *(len+1)*((2L * len) + 1))/6;

        long s = 0;
        long s2 = 0;
        for (int val : nums) {
            s = s + val;
            s2 = s2 + ((long) val * val);
        }
        //S-Sn = X-Y:
        long val1 = s - sn;
        // S2-S2n = X^2-Y^2:
        long val2 = s2 - s2n;

        //Find X+Y = (X^2-Y^2)/(X-Y):
        val2 = val2/val1;

        //Find X and Y: X = ((X+Y)+(X-Y))/2 and Y = X-(X-Y),
        // Here, X-Y = val1 and X+Y = val2:
        long x = (val1 + val2)/2;
        long y = x - val1;

        return new int[]{(int) x, (int) y};

    }
}
