package abhi.practice.arrays.easy.sorted_array;

/**
 * Problem Statement: Given an array of size n, write a program to check if the given array is sorted in
 * (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.
 * Two consecutive equal values are considered to be sorted.
 *
 *
 *
 *
 */
public class FirstSolution {

    public static void main(String[] args) {
        int [] array = {10, 5, 10, 15, 10, 5};
        System.out.println(isSorted(array));
        int [] sortedArray = {1, 5, 10, 15, 18, 25};
        System.out.println(isSorted(sortedArray));

        int [] emptyArray = {};
        System.out.println(isSorted(emptyArray));

        int [] oneArray = {1};
        System.out.println(isSorted(oneArray));

        int [] sameArray = {1, 1, 1};
        System.out.println(isSorted(sameArray));
    }

    private static boolean isSorted(int[] array) {
        int prevElement = Integer.MIN_VALUE;
        boolean sorted = true;
        for (int value : array) {
            if (value < prevElement) {
                sorted = false;
                break;
            } else {
                prevElement = value;
            }
        }
        return sorted;
    }
}
