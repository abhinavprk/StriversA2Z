package abhi.practice.basic_hashing.counting_frequencies;

import java.util.*;

/**
 * Problem statement: Given an array, we have found the number of occurrences of each element in the array.
 * <p>
 * Example 1:
 * Input: arr[] = {10,5,10,15,10,5};
 * Output: 10  3
 * 	 5  2
 *   15  1
 * Explanation: 10 occurs 3 times in the array
 * 	      5 occurs 2 times in the array
 *        15 occurs 1 time in the array
 * <p>
 * Example2:
 * Input: arr[] = {2,2,3,4,4,2};
 * Output: 2  3
 * 	3  1
 *  4  2
 * Explanation: 2 occurs 3 times in the array
 * 	     3 occurs 1 time in the array
 *       4 occurs 2 time in the array
 *
 */
public class ArrayElementFrequency {
    public static void main(String[] args) {
        int [] array = {10, 5, 10, 15, 10, 5};
        findFrequencyOfElements(array, 15);
        System.out.println();
        int [] array1 = {2, 2, 3, 4, 4, 2};
        findFrequencyOfElements(array1, 4);

    }

    private static void findFrequencyOfElements(int[] array, int maxInt) {
        int[] hash = new int[maxInt + 1];
        for (int val : array) {
            hash[val] = hash[val] + 1;
        }
       Set<Integer> visited = new HashSet<>();
        for (int val: array){
            if(!visited.contains(val)) {
                System.out.println(val + "    " + hash[val]);
                visited.add(val);
            }
        }
    }
}
