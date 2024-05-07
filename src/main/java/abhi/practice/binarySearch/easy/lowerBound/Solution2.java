package abhi.practice.binarySearch.easy.lowerBound;

/**
 * Problem Statement: Given a sorted array of N integers and an integer x, write a program to find the lower bound of x.
 *
 * Example 1:
 * Input Format:
 *  N = 4, arr[] = {1,2,2,3}, x = 2
 * Result:
 *  1
 * Explanation:
 *  Index 1 is the smallest index such that arr[1] >= x.
 *
 * Example 2:
 * Input Format:
 *  N = 5, arr[] = {3,5,8,15,19}, x = 9
 * Result:
 *  3
 * Explanation:
 *  Index 3 is the smallest index such that arr[3] >= x.
 *
 */
public class Solution2 {

    public static void main(String[] args) {
        System.out.println(findLowerBound(new int[]{1,2,2,3}, 2));
        System.out.println(findLowerBound(new int[]{3,5,8,15,19}, 15));
    }

    private static int findLowerBound(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int result = high;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] >= target){
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}
