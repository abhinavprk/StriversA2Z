package abhi.practice.basic_math.gcd;

/**
 * Find GCD of two numbers
 *
 * Euclidean algorithm
 * https://en.wikipedia.org/wiki/Euclidean_algorithm
 *
 * function gcd(a, b)
 *     if b = 0
 *         return a
 *     else
 *         return gcd(b, a mod b)
 */
public class SecondSolution {

    public static void main(String[] args) {
        System.out.println(getGcd(12,4));
        System.out.println(getGcd(105,252));
    }

    private static int getGcd(int num1, int num2) {
        System.out.println(num1 + "  " + num2);
        if(Math.min(num1,num2) == 0){
            return num1;
        } else {
            return getGcd(Math.min(num1,num2), Math.max(num1,num2) % Math.min(num1,num2) );
        }
    }


    /**
     * This works without even taking care of the min and max of the two.
     * 252  105
     * 252 105 % 252
     * 252 42
     *
     *
      */
}
