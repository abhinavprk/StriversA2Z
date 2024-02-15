package abhi.practice.sorting.insertion;

import java.util.Arrays;

/**
 * Assume that the array is sorted until first element
 * From second element, select an element and insert it at the correct position
 */
public class FirstSolution {
    public static void main(String[] args) {
        int[] input = {12, 2, 45, 33, 7, 28, 6};
        System.out.println(Arrays.toString(sortArray(input)));
    }

    private static int[] sortArray(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int curr = input[i];
            int j = i - 1;
            while (j >= 0 && input[j] > curr) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = curr;
        }
        return input;
    }
}
