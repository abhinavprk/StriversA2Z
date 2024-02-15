package abhi.practice.sorting.selection;

import java.util.Arrays;

public class FirstSolution {
    public static void main(String[] args) {
        int [] input = {12, 2, 45, 33, 7, 28, 6};
        System.out.println(Arrays.toString(sortArray(input)));
    }

    private static int[] sortArray(int[] input) {
        for (int i = 0; i < input.length-1; i++) {
            int smallestIndex = i;
            for (int j = i+1 ; j < input.length; j++) {
                if(input[j] < input[smallestIndex]){
                    smallestIndex = j;
                }
            }
            int temp = input[i];
            input[i] = input[smallestIndex];
            input[smallestIndex] = temp;
        }
        return input;
    }
}
