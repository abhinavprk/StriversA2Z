package abhi.practice.arrays.easy.moveZeroesToEnd;

import java.util.Arrays;

public class Solution3 {

    public static void main(String[] args) {
        int [] input = {0,1,0,3,12};
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(moveZeroes(input)));
        int[] input2 = {4,2,4,0,0,3,0,5,1,0};
        System.out.println();
        System.out.println(Arrays.toString(input2));
        System.out.println(Arrays.toString(moveZeroes(input2)));

    }

    private static int[] moveZeroes(int[] nums) {
        int k = 0;
        for (int i=0; i<nums.length ; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                if(k != i){
                    nums[i] = 0;
                }
                k++;
            }
        }
        return nums;
    }
}
