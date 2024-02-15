package abhi.practice.basic.math.digitsInANumber;

/**
 * Given an integer N, write a program to count the number of digits in N.
 */
public class ThirdSolution {
    public static void main(String[] args) {
        System.out.println(countDigits(236349));
        System.out.println(countDigits(400));
        System.out.println(countDigits(-41));
        System.out.println(countDigits(1));
        System.out.println(countDigits(-1));
    }

    private static int countDigits(int input) {
        return Integer.toUnsignedString(input).length();
    }


}
