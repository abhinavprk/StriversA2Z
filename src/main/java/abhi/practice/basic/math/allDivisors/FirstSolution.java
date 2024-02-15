package abhi.practice.basic.math.allDivisors;

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
 */
public class FirstSolution {
    public static void main(String[] args) {
        printAllDivisors(36);
        printAllDivisors(97);
    }

    private static void printAllDivisors(int input) {
        System.out.print(1 + " ");
        for(int val = 2 ; val <= input ; val++){
            if(input % val == 0){
                System.out.print(val + " ");
            }
        }
        System.out.println();
    }
}
