    package abhi.practice.patterns;

/**
 *    A
 *    B B
 *    C C C
 *    D D D D
 *    E E E E E
 */
public class Pattern16 {
    public static void main(String[] args) {
        System.out.println("First pattern is:");
        createPattern(4);
        System.out.println("\n");
        System.out.println("Second pattern is:");
        createPattern(5);
    }

    private static void createPattern(int numOfRows) {
        char initValue = 65;
        for (int row = 0; row < numOfRows; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(initValue);
            }
            initValue++;
            System.out.println();
        }
    }
}
