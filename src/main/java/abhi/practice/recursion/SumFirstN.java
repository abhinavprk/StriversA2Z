package abhi.practice.recursion;

public class SumFirstN {

    public static void main(String[] args) {
        sumToN(0, 10);
        sumToN(0, 20);
        sumToN(0, 30);
    }

    private static void sumToN(int sum, int number) {
        if(number != 0){
            sumToN((sum + number), --number);
        } else {
            System.out.println("Sum is: " + sum);
        }

    }
}
