package abhi.practice.arrays.hard.longestSubarrayWithZeroSum;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem Statement: Given an array containing both positive and
 * negative integers, we have to find the length of the longest subarray
 * with the sum of all elements equal to zero.
 * <p>
 * Example 1:
 * Input Format
 * : N = 6, array[] = {9, -3, 3, -1, 6, -5}
 * Result
 * : 5
 * Explanation
 * : The following subarrays sum to zero:
 * {-3, 3} , {-1, 6, -5}, {-3, 3, -1, 6, -5}
 * Since we require the length of the longest subarray, our answer is 5!
 * <p>
 * Example 2:
 * Input Format:
 * N = 8, array[] = {6, -2, 2, -8, 1, 7, 4, -10}
 * Result
 * : 8
 * Subarrays with sum 0 : {-2, 2}, {-8, 1, 7}, {-2, 2, -8, 1, 7}, {6, -2, 2, -8, 1, 7, 4, -10}
 * Length of longest subarray = 8
 * <p>
 * Example 3:
 * Input Format:
 * N = 3, array[] = {1, 0, -5}
 * Result
 * : 1
 * Subarray : {0}
 * Length of longest subarray = 1
 * <p>
 * Example 4:
 * Input Format:
 * N = 5, array[] = {1, 3, -5, 6, -2}
 * Result
 * : 0
 * Subarray: There is no subarray that sums to zero
 */
public class Solution3 {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubArray(new int[]{9, -3, 3, -1, 6, -5}));
        System.out.println(lengthOfLongestSubArray(new int[]{6, -2, 2, -8, 1, 7, 4, -10}));
        System.out.println(lengthOfLongestSubArray(new int[]{1, 0, -5}));
        System.out.println(lengthOfLongestSubArray(new int[]{1, 3, -5, 6, -2}));
    }

    private static int lengthOfLongestSubArray(int[] nums) {
        int len = 0;
        int sum = 0;
        Map<Integer, Integer> commutativeSum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (commutativeSum.containsKey(sum)) {
                int prevIndex = commutativeSum.get(sum);
                len = Math.max(len, i - prevIndex);
            } else if (sum == 0) {
                len = Math.max(len, i+1);
            } else {
                commutativeSum.put(sum, i);
            }
        }
        return len;
    }
}
