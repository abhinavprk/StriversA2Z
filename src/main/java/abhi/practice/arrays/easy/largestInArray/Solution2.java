package abhi.practice.arrays.easy.largestInArray;

import java.util.Arrays;

/**
 * Given an array, we have to find the largest element in the array.
 */
public class Solution2 {
    public static void main(String[] args) {
        int[] input = {2,5,1,3,0};
        System.out.println(findLargest(input));
    }

    private static int findLargest(int[] input) {
        int largest = Integer.MIN_VALUE;
        for (int val : input){
            largest = Math.max(largest, val);
        }
        return largest;
    }
}
