package abhi.practice.basic.math.numberPalindrome;

public class FirstSolution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123321));
        System.out.println(isPalindrome(12345));
    }

    private static boolean isPalindrome(int input) {
        int inputNumber = input;
        int reverse = 0;
        while(inputNumber != 0){
            int digit = inputNumber % 10;
            reverse = reverse*10 + digit;
            inputNumber = inputNumber/10;
        }
        return input == reverse;
    }
}
