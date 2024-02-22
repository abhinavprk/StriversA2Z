package abhi.practice.arrays.easy.longestSubarryWithSumN;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution4 {
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
     *
     */
    private static int lengthOfLongestSubArray(int[] input, int k) {
        int maxLength = 0;
        int sum = 0;
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        for(int i = 0; i<input.length; i++){
            sum = sum + input[i];
            if(sum == k){
                maxLength = Math.max(maxLength, i+1);
            } else if((sum > k) && (prefixSumMap.containsKey(sum -k))){
                //If sum is > k, to make the current index end of a sub-array that has a sum = k, there must be
                // an index in the array behind current index, until which the sum is sum-k
                maxLength = Math.max(maxLength, i-prefixSumMap.get(sum -k));
            } else {
                //if the sum is smaller than k or (greater than k where there is no substring with sum k found)
                //add this to map (sum until now,currentIndex). This will be used to find the next sub array
                // that has sum k
                prefixSumMap.put(sum, i);
            }
        }

        return maxLength;
    }
}
