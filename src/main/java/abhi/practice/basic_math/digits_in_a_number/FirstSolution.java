package abhi.practice.basic_math.digits_in_a_number;

/**
 * Given an integer N, write a program to count the number of digits in N.
 */
public class FirstSolution {
    public static void main(String[] args) {
        System.out.println(countDigits(236349));
        System.out.println(countDigits(400));
        System.out.println(countDigits(-41));
        System.out.println(countDigits(1));
        System.out.println(countDigits(-1));
    }

    private static int countDigits(int input) {
        int inputNumber = input;
        int count = 1;
        while((inputNumber / 10) != 0){
            inputNumber = inputNumber / 10;
            count++;
        }
        return count;
    }


}
