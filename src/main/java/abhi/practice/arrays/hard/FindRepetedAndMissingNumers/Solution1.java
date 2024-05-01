package abhi.practice.arrays.hard.FindRepetedAndMissingNumers;


import java.util.Arrays;

/**
 * Problem Statement: You are given a read-only array of N
 * integers with values also in the range [1, N] both inclusive.
 * Each integer appears exactly once except A which appears
 * twice and B which is missing. The task is to find the
 * repeating and missing numbers A and B where A repeats twice and B is missing.
 */
public class Solution1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findNumbers(new int[]{3, 1, 2, 5, 3})));
        System.out.println(Arrays.toString(findNumbers(new int[]{3, 1, 2, 5, 4, 6, 7, 5})));
    }

    private static int[] findNumbers(int[] nums) {
        int[] result = new int[2];

        int[] hash = new int[nums.length + 1];

        for (int val : nums) {
            hash[val] = hash[val] + 1;
        }
        int res = 0;
        for (int i = 1; i < nums.length + 1; i++) {
            if (hash[i] == 2) {
                result[0] = i;
            } else if (hash[i] == 0) {
                result[1] = i;
            }
        }

        return result;
    }
}
