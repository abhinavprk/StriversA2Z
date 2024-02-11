package abhi.practice.basic_math.all_divisors;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Problem Statement: Given a number, print all the divisors of the number.
 * A divisor is a number that gives the remainder as zero when divided.
 * <p>
 * Example 1:
 * Input: n = 36
 * Output: 1 2 3 4 6 9 12 18 36
 * Explanation: All the divisors of 36 are printed.
 * <p>
 * Example 2:
 * Input: n = 97
 * Output: 1 97
 * Explanation: Since 97 is a prime number, only 1 and 97 are printed.
 * <p>
 *
 * If we take a closer look, we can notice that the quotient of a division by one of the divisors
 * is actually another divisor. Like, 4 divides 36. The quotient is 9, and 9 also divides 36.
 * Another intuition is that the root of a number actually acts as a splitting part of all the divisors
 * of a number.
 * Also, the quotient of a division by any divisor gives an equivalent divisor on
 * the other side. Like, 4 gives 9 while dividing 36. See the image below.
 */
public class SecondSolution {
    public static void main(String[] args) {
        printAllDivisorsSorted(36);
        printAllDivisorsUnsorted(36);
        printAllDivisorsSorted(97);
        printAllDivisorsUnsorted(97);
    }

    private static void printAllDivisorsSorted(int input) {
        SortedSet<Integer> divisors = new TreeSet<>();
        divisors.add(1);
        divisors.add(input);
        for(int val = 2 ; val <= Double.valueOf(Math.sqrt(input)).intValue() ; val++){
            if(input % val == 0){
                divisors.add(val);
                divisors.add(input/val);
            }
        }
        for(Integer v : divisors) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    private static void printAllDivisorsUnsorted(int input) {

        for(int val = 1 ; val <= Double.valueOf(Math.sqrt(input)).intValue() ; val++){
            if(input % val == 0){
                System.out.print(val + " ");
                if(val != input/val){
                    System.out.print(input/val + " ");
                }
            }
        }
        System.out.println();
    }
}
