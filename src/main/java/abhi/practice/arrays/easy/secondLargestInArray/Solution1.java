package abhi.practice.arrays.easy.secondLargestInArray;

import java.util.Arrays;

/**
 * Given an array, find the second smallest and the
 * second-largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.
 * <p>
 * Example 1:
 * Input: [1,2,4,7,7,5]
 * Output: Second Smallest : 2
 * 	Second Largest : 5
 * Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2
 * <p>
 * Example 2:
 * Input: [1]
 * Output: Second Smallest : -1
 * 	Second Largest : -1
 * Explanation: Since there is only one element in the array, it is the largest and smallest
 * element present in the array. There is no second largest or second-smallest element present.
 */
public class Solution1 {
    public static void main(String[] args) {
        findSecondLargestAndSmallest(new int []{2,5,1,3,0});
        findSecondLargestAndSmallest(new int []{2,5,1,3,0,8,4,1});
    }

    private static void findSecondLargestAndSmallest(int[] input) {
        int secondLargest = -1;
        int secondSmallest = -1;
        Arrays.sort(input);
        for (int index = 0; index< input.length; index ++){
            if(input[index+1] > input[index]){
                secondSmallest = input[index+1];
                break;
            }
        }
        for (int index = input.length -1; index > 0; index --){
            if(input[index-1] < input[index]){
                secondLargest = input[index-1];
                break;
            }
        }
        System.out.println("Second Smallest: " + secondSmallest);
        System.out.println("Second Largest: " + secondLargest);
    }
}
