package abhi.practice.basic.math.reverseANumber;

public class FirstSolution {

    public static void main(String[] args) {
        System.out.println(reverseNumber(278836));
        System.out.println(reverseNumber(-32763));
    }

    private static int reverseNumber(int number) {
        int reversedNumber=0;
        int input = number;
        while(input != 0){
            int digit = input % 10;
            reversedNumber = reversedNumber*10 + digit;
            input = input/10;
        }
        return reversedNumber;

    }
}
