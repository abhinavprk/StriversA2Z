package abhi.practice.recursion;

public class PrintName {

    public static void main(String[] args) {
        printName("Abhinav", 10);
    }

    private static void printName(String name, int count) {
        if(count != 0){
            System.out.println(name);
            printName(name, --count);
        }
    }
}
