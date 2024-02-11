package abhi.practice.basic_math.gcd;

/**
 * Find GCD of two numbers
 */
public class FirstSolution {

    public static void main(String[] args) {
        System.out.println(getGcd(12,4));
        System.out.println(getGcd(11,18));
    }

    private static int getGcd(int num1, int num2) {
        int gcd = 1;
        for(int i = 2; i < Math.min(num1, num2); i++ ){
            if((num1 % i == 0) && (num2%i == 0)){
                gcd = Math.max(gcd, i);
            }
        }
        return gcd;
    }
}
