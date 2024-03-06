package abhi.practice.arrays.medium.leadersInAnArray;

public class Solution1 {

    public static void main(String[] args) {
        findLeaders(new int[]{4,7,1,0});
        findLeaders(new int[]{10,22,12,3,0,6});
    }

    private static void findLeaders(int[] nums) {
        for (int i=0; i<nums.length; i++ ){
            int candidate = nums[i];
            int j = i+1;
            while (j< nums.length){
                if (candidate < nums[j]){
                    break;
                }
                j++;
            }
            if(j == nums.length){
                System.out.print(candidate + " ");
            }
        }
        System.out.println();
    }
}
