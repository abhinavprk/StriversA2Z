package abhi.practice.basic.math.checkPrime;

/**
 * Problem Statement: Given a number, check whether it is prime or not. A prime number is a natural number that is only divisible by 1 and by itself.
 * <p>
 * Examples 1 2 3 5 7 11 13 17 19 …
 */
public class FirstSolution {
    public static void main(String[] args) {
        System.out.println(checkIfPrime(2));
        System.out.println(checkIfPrime(12));
        System.out.println(checkIfPrime(23));
    }

    private static boolean checkIfPrime(int input) {
        boolean isPrime = true;
        for(int i = 2; i < input; i++) {
            if((input % i) == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
