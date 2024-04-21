package abhi.practice.arrays.hard.CountNumberOfSubarraysWithGivenXorK;

/*
Example 1:
Input Format:
 A = [4, 2, 2, 6, 4] , k = 6
Result:
 4
Explanation:
 The subarrays having XOR of their elements as 6 are  [4, 2], [4, 2, 2, 6, 4], [2, 2, 6], [6]

Example 2:
Input Format:
 A = [5, 6, 7, 8, 9], k = 5
Result:
 2
Explanation:
 The subarrays having XOR of their elements as 5 are [5] and [5, 6, 7, 8, 9]
 */
public class Solution1 {

    public static void main(String[] args) {
        System.out.println(countSubArrays(new int []{4, 2, 2, 6, 4}, 6));
        System.out.println(countSubArrays(new int []{5, 6, 7, 8, 9}, 5));
    }

    private static int countSubArrays(int [] nums, int k){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int xor = 0;
            for (int j = i; j < nums.length; j++) {
                xor = xor ^ nums[j];
                if(xor == k){
                    count++;
                }
            }
        }
        return count;
    }
}
