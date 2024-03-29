package abhi.practice.sorting.bubble;

import java.util.Arrays;

/**
 * Push the largest element to the end of the array using adjacent swapping
 */
public class FirstSolution {
    public static void main(String[] args) {
        int [] input = {12, 2, 45, 33, 7, 28, 6};
        System.out.println(Arrays.toString(sortArray(input)));
    }

    private static int[] sortArray(int[] input) {
        for (int i = 0; i < input.length-1; i++) {
            boolean swapped = false;
            for (int j = 0; j < input.length-i -1; j++) {
                if(input[j] > input[j+1]){
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return input;
    }
}
