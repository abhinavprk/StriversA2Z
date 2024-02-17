package abhi.practice.sorting.merge;

import javax.crypto.spec.PSource;
import java.util.Arrays;

/**
 * Divide and merge in sorted order
 */
public class FirstSolution {

    public static void main(String[] args) {
        int[] input = {3, 1, 2, 4, 1, 5, 2, 6, 4};
        mergeSort(input);
        System.out.println(Arrays.toString(input));
    }

    private static void mergeSort(int[] input) {
        divideAndMerge(input, 0, input.length-1);
    }

    private static void divideAndMerge(int[] input, int start, int end) {
        if(start>=end) {
            return;
        }
        int mid = (start + end)/2;
        divideAndMerge(input, start, mid);
        divideAndMerge(input, mid +1, end);
        merge(input, start, mid, end);
    }

    private static void merge(int[] input, int start, int mid, int end) {
        int left = start;
        int right = mid +1;
        int[] tempArray = new int[end-start +1];
        int tempArrayIndex=0;
        while((left < mid+1) && (right <= end)) {
            if(input[left] <= input[right]){
                tempArray[tempArrayIndex] = input[left];
                left++;
            } else {
                tempArray[tempArrayIndex] = input[right];
                right++;
            }
            tempArrayIndex++;
        }
        while (left < mid+1){
            tempArray[tempArrayIndex] = input[left];
            left++;
            tempArrayIndex++;
        }
        while (right <= end){
            tempArray[tempArrayIndex] = input[right];
            right++;
            tempArrayIndex++;
        }
        System.arraycopy(tempArray, 0, input, start, tempArray.length);
    }

}
