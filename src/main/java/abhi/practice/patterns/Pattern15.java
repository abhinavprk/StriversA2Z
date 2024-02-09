    package abhi.practice.patterns;

/**
 *    ABCDE
 *    ABCD
 *    ABC
 *    AB
 *    A
 */
public class Pattern15 {
    public static void main(String[] args) {
        System.out.println("First pattern is:");
        createPattern(4);
        System.out.println("\n");
        System.out.println("Second pattern is:");
        createPattern(5);
    }

    private static void createPattern(int numOfRows) {

        for (int row = 0; row < numOfRows; row++) {
            char initValue = 65;
            for (int col = (numOfRows-row-1); col >= 0; col--) {
                System.out.print(initValue);
                initValue++;
            }
            System.out.println();
        }
    }
}
