package abhi.practice.sorting.insertion;

import java.util.Arrays;

/**
 * Assume that the array is sorted until first element
 * From second element, select an element and insert it at the correct position
 */
public class RecursiveSolution {
    public static void main(String[] args) {
        int[] input = {12, 2, 45, 33, 7, 28, 6};
        System.out.println(Arrays.toString(sortArray(input, 1)));
    }

    private static int[] sortArray(int[] input, int index) {
            if(index == input.length){
                return input;
            }
            int curr = input[index];
            int j = index - 1;
            while (j >= 0 && input[j] > curr) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = curr;
        sortArray(input, index+1);
        return input;
    }
}
