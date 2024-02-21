package abhi.practice.arrays.easy.leftRotateByOne;

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(leftRotateByOne(array)));
    }

    private static int[] leftRotateByOne(int[] array) {
        int previous = array[0];
        for (int i = 0; i <= array.length; i++) {
            int nextIndex = (i +1)%array.length;
            int temp = array[nextIndex];
            array[nextIndex] = previous;
            previous = temp;
        }
        return array;
    }
}
