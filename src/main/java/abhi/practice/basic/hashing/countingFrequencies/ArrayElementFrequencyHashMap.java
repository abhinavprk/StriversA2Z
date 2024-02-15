package abhi.practice.basic.hashing.countingFrequencies;

import java.rmi.MarshalledObject;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
public class ArrayElementFrequencyHashMap {
    public static void main(String[] args) {
        int [] array = {10, 5, 10, 15, 10, 5};
        findFrequencyOfElements(array);
        System.out.println();
        int [] array1 = {2, 2, 3, 4, 4, 2};
        findFrequencyOfElements(array1);

    }

    private static void findFrequencyOfElements(int[] array) {
        Map<Integer, Integer> hash = new HashMap<>();
        for (int val : array) {
            int currentVal = hash.get(val) != null ? hash.get(val) : 0;
            hash.put(val, currentVal +1);
        }
       Set<Integer> visited = new HashSet<>();
        for (int val: array){
            if(!visited.contains(val)) {
                System.out.println(val + "    " + hash.get(val));
                visited.add(val);
            }
        }
    }
}
