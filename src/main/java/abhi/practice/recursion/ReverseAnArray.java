package abhi.practice.recursion;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseAnArray(new int[]{3,5,2,6}, new int[4], 4, 0)));
        System.out.println(Arrays.toString(reverseAnArray( new int[]{1,4,6,6}, new int[4], 4, 0)));
        System.out.println(Arrays.toString(reverseAnArray( new int[]{5,6,9,7}, new int[4], 4, 0)));
    }

    private static int[] reverseAnArray(int[] array, int[] result, int length, int index) {
        while(length > 0) {
            result[--length] = array[index];
            return reverseAnArray(array, result, length, ++index );
        }
        return result;
    }

    /**
     * Strivers A2Z solution
     * @param originalArray Array to be reversed
     * @param start left index (pointer) of the array
     * @param end right index (pointer) in the array
     */
    private static void reverseArray(int []originalArray, int start, int end) {
        if (start < end) {
            int tmp = originalArray[start];
            originalArray[start] = originalArray[end];
            originalArray[end] = tmp;
            reverseArray(originalArray, start + 1, end - 1);
        }
    }
}
