package abhi.practice.arrays.easy.longestSubarryWithSumN;

import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) {
        int [] input = {2,3,5,1,9};
        int k = 10;

        System.out.println(lengthOfLongestSubArray(input, k));

        int [] input1 = {2,3,5};
        int k1 = 5;

        System.out.println(lengthOfLongestSubArray(input1, k1));
    }

    /**
     * Find all the sub arrays whose sum is equal to K and return the length of the longest.
     */
    private static int lengthOfLongestSubArray(int[] input, int k) {
        Arrays.sort(input);
        int count = 0;
        for(int i = 0; i<input.length; i++){
            if(input[i] >= k){
                break;
            }
            for(int j = i+1; j<input.length; j++){
                int n = i;
                int sum = 0;
                while(n<=j && (input[n]<=k)){
                    sum = sum + input[n];
                    n++;
                }
                if (sum == k){
                    count = Math.max(count, j-i+1);
                }
            }
        }
        return count;
    }
}
