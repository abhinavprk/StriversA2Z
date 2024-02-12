package abhi.practice.recursion;

public class PrintNTo1 {

    public static void main(String[] args) {
        printNTo1(10);
    }

    private static void printNTo1(int number) {
        if(number != 0){
            System.out.println(number);
            printNTo1(--number);
        }
    }
}
