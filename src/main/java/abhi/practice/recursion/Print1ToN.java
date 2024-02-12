package abhi.practice.recursion;

public class Print1ToN {

    public static void main(String[] args) {
        print1ToN(10, 1);
    }

    private static void print1ToN(int number, int count) {
        if(number != 0){
            System.out.println(count);
            print1ToN(--number, ++count);
        }
    }
}
