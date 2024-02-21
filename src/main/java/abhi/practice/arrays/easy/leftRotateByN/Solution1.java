package abhi.practice.arrays.easy.leftRotateByN;

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7};
        int n = 3;
        System.out.println(Arrays.toString(leftRotateByN(array, n)));
    }

    private static int[] leftRotateByN(int[] array, int n) {
       int [] resultArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int destinationIndex = (i+n) % array.length;
            resultArray[destinationIndex] = array[i];
        }
        return resultArray;
    }
}
