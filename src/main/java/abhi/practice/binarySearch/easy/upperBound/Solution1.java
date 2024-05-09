package abhi.practice.binarySearch.easy.upperBound;

/*
Problem Statement: Given a sorted array of N integers and an integer x, write a program to find the upper bound of x.

Example 1:
Input Format:
 N = 4, arr[] = {1,2,2,3}, x = 2
Result:
 3
Explanation:
 Index 3 is the smallest index such that arr[3] > x.

Example 2:
Input Format:
 N = 6, arr[] = {3,5,8,9,15,19}, x = 9
Result:
 4
Explanation:
 Index 4 is the smallest index such that arr[4] > x.
 */
public class Solution1 {

    public static void main(String[] args) {
        System.out.println(getUpperBound(new int[]{3,5,8,9,15,19}, 9));
        System.out.println(getUpperBound(new int[]{3,5,8,15,19}, 5));
        System.out.println(getUpperBound(new int[]{3,5,8,15,19}, 3));
        System.out.println(getUpperBound(new int[]{1,2,2,3}, 2));

    }

    private static int getUpperBound(int [] nums, int target){
        int result = -1;
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] > target){
                result = mid;
                high = mid-1;
            } else{
                low = mid+1;
            }
        }
        return result;
    }
}
