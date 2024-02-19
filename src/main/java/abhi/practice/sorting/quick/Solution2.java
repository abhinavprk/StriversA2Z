package abhi.practice.sorting.quick;

import java.util.Arrays;
import java.util.random.RandomGenerator;

/**
 * Pick a pivot and place it at its correct place
 * Pick up the smaller and put at the left of the pivot
 * pick up the larger and put at the right of the pivot
 */
public class Solution2 {

    public static void main(String[] args) {
        int[] input = {3, 1, 2, 4, 1, 5, 2, 6, 4};
        quickSort(input);
        System.out.println(Arrays.toString(input));
    }

    private static void quickSort(int[] input) {


        quickSortWithPivot(input, 0, input.length-1);
    }

    private static void quickSortWithPivot(int[] input, int start, int end) {
      if(start<end){
          int partitionIndex = findPartition(input, start, end);
          quickSortWithPivot(input, start, partitionIndex-1);
          quickSortWithPivot(input, partitionIndex +1 , end);
      }
    }

    private static int findPartition(int[] input, int start, int end) {
        int pivot = end - RandomGenerator.getDefault().nextInt(100) % (((end - start) + 1));
        int i = start;
        int j = end;

        while (i<j){
            while (input[i] <= input[pivot] && i<= end-1){
                i++;
            }

            while (input[j] > input[pivot] && j >= start+1){
                j--;
            }
            if(i<j){
                int tmp = input[i];
                input[i] = input[j];
                input[j] = tmp;
            }
        }
        int tmp = input[j];
        input[j] = input[pivot];
        input[pivot] = tmp;
        return j;
    }


}
