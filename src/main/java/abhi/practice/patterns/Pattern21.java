    package abhi.practice.patterns;

/**
 *  * * * *
 *  *     *
 *  *     *
 *  * * * *
 *
 */
public class Pattern21 {
    public static void main(String[] args) {
        System.out.println("First pattern is:");
        createPattern(3);
        System.out.println("\n");
        System.out.println("Second pattern is:");
        createPattern(7);
    }

    private static void createPattern(int numOfRows) {
        //First half
        for (int row = 0; row < numOfRows; row++) {
            for (int col = 0; col < numOfRows; col++) {
                if((row == 0) || (row == (numOfRows - 1)) || (col == 0) || (col == (numOfRows - 1))){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
