    package abhi.practice.patterns;

/**
 *    1
 *    0 1
 *    1 0 1
 *    0 1 0 1
 *    1 0 1 0 1
 */
public class Pattern11 {
    public static void main(String[] args) {
        System.out.println("First pattern is:");
        createPattern(4);
        System.out.println("\n");
        System.out.println("Second pattern is:");
        createPattern(5);
    }

    private static void createPattern(int numOfRows) {
        for (int row = 0; row < numOfRows; row++) {
            for (int col = 0; col < (row + 1) ; col++) {
                // If row and column both are either even or odd, print 1 otherwise 0
                if(((row % 2 == 0) && (col % 2 == 0)) || ((row % 2 != 0) && (col % 2 != 0))) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
