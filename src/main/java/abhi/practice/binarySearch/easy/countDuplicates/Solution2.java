package abhi.practice.binarySearch.easy.countDuplicates;

public class Solution2 {

    public static void main(String[] args) {
        System.out.println(countDuplicate(new int[]{2, 2, 3, 3, 3, 3, 4}, 3));
        System.out.println(countDuplicate(new int[]{1, 2, 2, 2, 2, 2, 2, 3}, 2));
        System.out.println(countDuplicate(new int[]{1, 2, 2, 2, 2, 2, 2, 3}, 7));
    }

    private static int countDuplicate(int[] nums, int target) {
        int first = getFirstOccurrence(nums, target);
       // System.out.println("First: "+ first);
        int last = getLastOccurrence(nums,target);
        //System.out.println("Last: "+ last);
        int count;
        if(first == -1){
            count = 0;
        } else {
            count = last-first+1;
        }
        return count;
    }

    private static int getFirstOccurrence(int[] nums, int target) {
        int result = -1;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
           int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                result = mid;
                if ((mid > 0) && (nums[mid - 1] == target)) {
                    high = mid - 1;
                } else {
                    break;
                }
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    private static int getLastOccurrence(int[] nums, int target) {
        int result = -1;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                result = mid;
                if ((mid > 0) && (nums[mid + 1] == target)) {
                    low = mid + 1;
                } else {
                    break;
                }
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}
