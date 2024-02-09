    package abhi.practice.patterns;

/**
 *   E
 *   D E
 *   C D E
 *   B C D E
 *   A B C D E
 */
public class Pattern18 {
    public static void main(String[] args) {
        System.out.println("First pattern is:");
        createPattern(4);
        System.out.println("\n");
        System.out.println("Second pattern is:");
        createPattern(5);
    }

    private static void createPattern(int numOfRows) {
        char initValue = 69;
        for (int row = 0; row < numOfRows; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(initValue + " ");
                initValue++;
            }
            initValue = (char) (initValue - (row + 2));
            System.out.println();
        }

    }
}
