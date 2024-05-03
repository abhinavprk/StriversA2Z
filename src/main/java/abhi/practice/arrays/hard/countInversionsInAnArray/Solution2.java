package abhi.practice.arrays.hard.countInversionsInAnArray;

/*
Problem Statement: Given an array of N integers, count the inversion of the array (using merge-sort).

What is an inversion of an array? Definition: for all i & j < size of array, if i < j then you have to find pair
(A[i],A[j]) such that A[j] < A[i].

Example 1:
Input Format
: N = 5, array[] = {1,2,3,4,5}
Result
: 0
Explanation
: we have a sorted array and the sorted array has 0 inversions as for i < j you will never find a pair such that
 A[j] < A[i]. More clear example: 2 has index 1 and 5 has index 4 now 1 < 5 but 2 < 5 so this is not an inversion.

Example 2:
Input Format
: N = 5, array[] = {5,4,3,2,1}
Result
: 10
Explanation
: we have a reverse sorted array and we will get the maximum inversions as for i < j we will always find a pair such that
A[j] < A[i]. Example: 5 has index 0 and 3 has index 2 now (5,3) pair is inversion as 0 < 2 and 5 > 3 which will satisfy out conditions and for reverse sorted array we will get maximum inversions and that is (n)*(n-1) / 2.For above given array there is 4 + 3 + 2 + 1 = 10 inversions.

Example 3:
Input Format
: N = 5, array[] = {5,3,2,1,4}
Result
: 7
Explanation
: There are 7 pairs (5,1), (5,3), (5,2), (5,4),(3,2), (3,1), (2,1) and we have left 2 pairs (2,4) and (1,4) as both are not satisfy our condition.

 */
public class Solution2 {
    public static void main(String[] args) {
        System.out.println(countInversionInTheArray(new int[]{1, 2, 3, 4, 5}));
        System.out.println(countInversionInTheArray(new int[]{5, 4, 3, 2, 1}));
        System.out.println(countInversionInTheArray(new int[]{5, 3, 2, 1, 4}));
    }

    private static int countInversionInTheArray(int[] nums) {
        return mergeShort(nums, 0, nums.length - 1);
    }

    private static int mergeShort(int[] nums, int low, int high) {
        int count = 0;
        if (low < high) {
            int mid = (low + high) / 2;
            count = count + mergeShort(nums, low, mid);
            count = count + mergeShort(nums, mid + 1, high);
            count = count + merge(nums, low, mid, high);
        }
        return count;
    }

    private static int merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int tempIndex = 0;
        int count = 0;
        // Here we are merging the two sorted parts of the arrays one starts from left and ends at mid,
        // and the second one starts from right and ends at high
        while ((left <= mid) && (right <= high)) {
            if (nums[left] <= nums[right]) {
                temp[tempIndex++] = nums[left];
                left++;
            } else {
                //if left is greater than the right this means that all the elements to the right of the
                //left are grater than the right. This means that (mid - left + 1) will be the count of pairs
                //with right that will form the inverse pair
                count += (mid - left + 1);
                temp[tempIndex++] = nums[right];
                right++;
            }
        }

        while (left <= mid) {
            temp[tempIndex++] = nums[left];
            left++;
        }

        while (right <= high) {
            temp[tempIndex++] = nums[right];
            right++;
        }
        if (high + 1 - low >= 0) System.arraycopy(temp, 0, nums, low, high + 1 - low);
        return count;
    }
}
