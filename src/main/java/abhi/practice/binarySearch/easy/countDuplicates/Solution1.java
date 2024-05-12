package abhi.practice.binarySearch.easy.countDuplicates;

public class Solution1 {

    public static void main(String[] args) {
        System.out.println(countDuplicate(new int[]{2, 2, 3, 3, 3, 3, 4}, 3));
        System.out.println(countDuplicate(new int[]{1, 1, 2, 2, 2, 2, 2, 3}, 2));
    }

    private static int countDuplicate(int[] nums, int target) {
        int count = 0;
        int low = 0;
        int high = nums.length - 1;
        int mid = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                count++;
                break;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        int currentMid = mid;
        while ((currentMid > 0) && ((nums[currentMid - 1] == target))) {
            count++;
            currentMid--;
        }
        currentMid = mid;
        while ((currentMid < nums.length) && ((nums[currentMid + 1] == target))) {
            count++;
            currentMid++;
        }

        return count;
}
}
