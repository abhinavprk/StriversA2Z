package abhi.practice.sorting.bubble;

import java.util.Arrays;

/**
 * Push the largest element to the end of the array using adjacent swapping
 */
public class RecursiveSolution {
    public static void main(String[] args) {
        int[] input = {12, 2, 45, 33, 7, 28, 6};
        System.out.println(Arrays.toString(sortArray(input, input.length - 1)));
    }

    private static int[] sortArray(int[] input, int index) {
        if (index == 1) {
            return input;
        }
        for (int j = 0; j < index; j++) {
            if (input[j] > input[j + 1]) {
                int temp = input[j];
                input[j] = input[j + 1];
                input[j + 1] = temp;
            }
        }
        sortArray(input, index - 1);
        return input;
    }
}
