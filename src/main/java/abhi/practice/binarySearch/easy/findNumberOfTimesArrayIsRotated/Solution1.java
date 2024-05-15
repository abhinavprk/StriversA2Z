package abhi.practice.binarySearch.easy.findNumberOfTimesArrayIsRotated;

/*
Problem Statement: Given an integer array arr of size N,
sorted in ascending order (with distinct values). Now the array is rotated between 1 to N times which is unknown.
Find how many times the array has been rotated.

Example 1:
Input Format:
 arr = [4,5,6,7,0,1,2,3]
Result:
 4
Explanation:
 The original array should be [0,1,2,3,4,5,6,7]. So, we can notice that the array has been rotated 4 times.

Example 2:
Input Format:
 arr = [3,4,5,1,2]
Result:
 3
Explanation:
 The original array should be [1,2,3,4,5]. So, we can notice that the array has been rotated 3 times.
 */
public class Solution1 {

    public static void main(String[] args) {
        System.out.println(findNoOfTimesTheArrayIsRotated(new int[]{4, 5, 6, 7, 0, 1, 2, 3}));
        System.out.println(findNoOfTimesTheArrayIsRotated(new int[]{3, 4, 5, 1, 2}));
        System.out.println(findNoOfTimesTheArrayIsRotated(new int[]{3, 4, 5, 6, 7, 0, 1, 2}));
    }

    private static int findNoOfTimesTheArrayIsRotated(int[] nums) {
        int min = Integer.MAX_VALUE;
        int low = 0;
        int high = nums.length-1;
        int minIndex = -1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid]<min){
                min = nums[mid];
                minIndex = mid;
            }
            if((nums[mid] >= nums[low]) && (nums[mid] >= nums[high])){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return minIndex;
    }
}
