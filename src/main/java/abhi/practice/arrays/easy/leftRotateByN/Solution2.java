package abhi.practice.arrays.easy.leftRotateByN;

import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7};
        int n = 3;
        System.out.println(Arrays.toString(leftRotateByN(array, n)));
        int [] array1 = {1};
        int n1 = 5;
        System.out.println(Arrays.toString(leftRotateByN(array1, n1)));
    }

    private static int[] leftRotateByN(int[] array, int n) {
        n = n % array.length;
        reverseArray(array, 0, array.length-1);
        reverseArray(array, 0, n - 1);
        reverseArray(array, n, array.length -1);
        return array;
    }

    private static void reverseArray(int[] array, int left, int right){
        while(left < right){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

}
