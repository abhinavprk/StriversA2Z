package abhi.practice.arrays.medium.leadersInAnArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution2 {

    public static void main(String[] args) {
        findLeaders(new int[]{4,7,1,0});
        System.out.println();
        findLeaders(new int[]{10,22,12,3,0,6});
    }

    private static void findLeaders(int[] nums) {
        int largestElement = Integer.MIN_VALUE;
        Stack<Integer> result = new Stack<>();
        for (int i=nums.length-1; i>0; i-- ){
            int curr = nums[i];
            if(curr > largestElement){
                result.add(curr);
            }
            largestElement = Math.max(curr, largestElement);
        }
        while(!result.isEmpty()) {
            System.out.print(result.pop() + " ");
        }
    }
}
