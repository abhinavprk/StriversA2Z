package abhi.practice.arrays.easy.secondLargestInArray;

/**
 * Given an array, find the second smallest and the
 * second-largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.
 * <p>
 * Example 1:
 * Input: [1,2,4,7,7,5]
 * Output: Second Smallest : 2
 * Second Largest : 5
 * Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2
 * <p>
 * Example 2:
 * Input: [1]
 * Output: Second Smallest : -1
 * Second Largest : -1
 * Explanation: Since there is only one element in the array, it is the largest and smallest
 * element present in the array. There is no second largest or second-smallest element present.
 */
public class Solution2 {
    public static void main(String[] args) {
        findSecondLargestAndSmallest(new int[]{2, 5, 1, 3, 0});
        findSecondLargestAndSmallest(new int[]{2, 5, 1, 3, 0, 8, 4, 1});
        findSecondLargestAndSmallest(new int[]{2, 2, 2});
        findSecondLargestAndSmallest(new int[]{1, 2});
        findSecondLargestAndSmallest(new int[]{1});
        findSecondLargestAndSmallest(new int[]{});
    }

    private static void findSecondLargestAndSmallest(int[] input) {
        int secondLargest = Integer.MIN_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        if (input.length < 2) {
            secondSmallest = -1;
            secondLargest = -1;
        } else {
            for (int val : input) {
                smallest = Math.min(smallest, val);
                largest = Math.max(largest, val);
            }
            if(smallest == largest){
                secondSmallest = -1;
                secondLargest = -1;
            } else {
                for (int currentVal : input) {
                    if ((currentVal > smallest) && (currentVal < secondSmallest)) {
                        secondSmallest = currentVal;
                    }
                }
                for (int currentVal : input) {
                    if ((currentVal < largest) && (currentVal > secondLargest)) {
                        secondLargest = currentVal;
                    }
                }
            }
        }
        System.out.println("Second Smallest: " + secondSmallest);
        System.out.println("Second Largest: " + secondLargest);
    }
}
