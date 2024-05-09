package abhi.practice.binarySearch.easy.floorAndCeil;

/*
Problem Statement: You're given an sorted array arr of n integers and an integer x. Find the floor and ceiling of x in arr[0..n-1].
The floor of x is the largest element in the array which is smaller than or equal to x.
The ceiling of x is the smallest element in the array greater than or equal to x.

Example 1:
Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 5
Result: 4 7
Explanation: The floor of 5 in the array is 4, and the ceiling of 5 in the array is 7.

Example 2:
Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 8
Result: 8 8
Explanation: The floor of 8 in the array is 8, and the ceiling of 8 in the array is also 8.
 */
public class Solution1 {

    public static void main(String[] args) {
        findFloorAndCeil(new int[]{3, 4, 4, 7, 8, 10}, 5);
        findFloorAndCeil(new int[]{3, 4, 5, 7, 8, 10}, 8 );
    }

    private static void findFloorAndCeil(int [] nums, int target){
        System.out.println(findFloor(nums, target) + "  "+ findCeiling(nums, target));
    }

    private static int findFloor(int [] nums, int target){
        int floorIndex = -1;
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + ((high - low)/2);
            if (nums[mid] <= target){
                floorIndex = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return nums[floorIndex];
    }

    private static int findCeiling(int [] nums, int target){
        int ceilIndex = -1;
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + ((high - low)/2);
            if (nums[mid] >= target){
                ceilIndex = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return nums[ceilIndex];
    }
}
