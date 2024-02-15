package abhi.practice.basic.math.reverseANumber;

public class SecondSolution {

    public static void main(String[] args) {
        System.out.println(reverseNumber(278836));
        System.out.println(reverseNumber(-32763));
    }

    private static int reverseNumber(int number) {
        boolean negative = number < 0;
        int value = Integer.parseInt(new StringBuffer(String.valueOf(Math.abs(number))).reverse().toString());
        return negative ? value*-1 : value;

    }
}
