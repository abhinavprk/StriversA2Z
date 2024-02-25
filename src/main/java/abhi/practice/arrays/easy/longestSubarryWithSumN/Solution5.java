package abhi.practice.arrays.easy.longestSubarryWithSumN;

public class Solution5 {
    public static void main(String[] args) {
        int[] input = {2, 3, 5, 1, 9};
        int k = 10;

        System.out.println(lengthOfLongestSubArray(input, k));

        int[] input1 = {2, 3, 5};
        int k1 = 5;

        System.out.println(lengthOfLongestSubArray(input1, k1));

        int [] input2 = {-1,1,1};
        int k2 = 1;

        System.out.println(lengthOfLongestSubArray(input2, k2));
    }

    /**
     * Find all the sub arrays whose sum is equal to K and return the length of the longest.
     */
    private static int lengthOfLongestSubArray(int[] input, int k) {
        int maxLength = 0;
        int sum = input[0];
        int firstIndex = 0;
        int secondIndex = 0;
        while (secondIndex < input.length) {
            //Move left index until the sum is equal to k, but the index is still smaller than the
            //secondIndex
            while ((firstIndex <= secondIndex) && (sum > k)) {
                sum -= input[firstIndex];
                firstIndex++;
            }
            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLength = Math.max(maxLength, secondIndex - firstIndex + 1);
            }
            // Move forward thw right pointer:
            secondIndex++;
            if (secondIndex < input.length) {
                sum += input[secondIndex];
            }
        }
        return maxLength;
    }
}
