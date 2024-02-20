package abhi.practice.arrays.easy.largestInArray;

import java.util.Arrays;

/**
 * Given an array, we have to find the largest element in the array.
 */
public class Solution1 {
    public static void main(String[] args) {
        int[] input = {2,5,1,3,0};
        Arrays.sort(input);
        System.out.println(input[input.length-1]);
    }
}
