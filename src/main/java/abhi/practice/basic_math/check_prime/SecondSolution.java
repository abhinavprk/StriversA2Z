package abhi.practice.basic_math.check_prime;

/**
 * Problem Statement: Given a number, check whether it is prime or not. A prime number is a natural number that is only divisible by 1 and by itself.
 * <p>
 * Examples 1 2 3 5 7 11 13 17 19 …
 * <p>
 * Approach: Running the for loop till the square root of the number
 * Using a for loop for checking if the number is divisible by a number from 2 to its square root.
 * Running the for loop from 2 to the square root of the number.
 * And then checking if the number is divisible by the numbers from 2 to its square root.
 * Then, If the remainder is zero, that means it is divisible and hence not a prime number.
 * If the loop runs till square root and none of the numbers divided it completely. So it is the Prime number.
 */
public class SecondSolution {
    public static void main(String[] args) {
        System.out.println(checkIfPrime(2));
        System.out.println(checkIfPrime(12));
        System.out.println(checkIfPrime(4651));
    }

    private static boolean checkIfPrime(int input) {
        boolean isPrime = true;
        for(int i = 2; i < Double.valueOf(Math.sqrt(input)).intValue(); i++) {
            if((input % i) == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
