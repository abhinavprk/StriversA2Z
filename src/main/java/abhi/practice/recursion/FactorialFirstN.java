package abhi.practice.recursion;

public class FactorialFirstN {

    public static void main(String[] args) {
        System.out.println(factorialFirstN( 5));
        System.out.println(factorialFirstN( 10));
        System.out.println(factorialFirstN( 15));
    }

    private static long factorialFirstN(long number) {
       if (number == 0){
           return 1;
       } else {
           return number * factorialFirstN(--number);
       }


    }
}
