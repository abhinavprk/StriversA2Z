package abhi.practice.arrays.easy.leftRotateByOne;

import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(leftRotateByOne(array)));
        int [] array1 = {1};
        System.out.println(Arrays.toString(leftRotateByOne(array1)));
    }

    private static int[] leftRotateByOne(int[] array) {
        int last = array[array.length-1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i-1];
        }
        array[0] = last;
        return array;
    }
}
