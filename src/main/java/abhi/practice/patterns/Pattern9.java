    package abhi.practice.patterns;

/**
 *            *
 *          * * *
 *        * * * * *
 *      * * * * * * *
 *    * * * * * * * * *
 *    * * * * * * * * *
 *      * * * * * * *
 *        * * * * *
 *          * * *
 *            *
 */
public class Pattern9 {
    public static void main(String[] args) {
        System.out.println("First pattern is:");
        createPattern(4);
        System.out.println("\n");
        System.out.println("Second pattern is:");
        createPattern(5);
    }

    private static void createPattern(int numOfRows) {
        int lastRowIndex = numOfRows - 1;
        //Print upper half
        for (int row = 0; row < numOfRows; row++) {
            for (int column = 0; column <= (2*lastRowIndex + 1); column++) {
                if((column >= lastRowIndex - (row)) && (column <= (lastRowIndex + row))) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //Print lower half
        for (int row = 0; row < numOfRows; row++) {
            for (int column = 0; column <= (2*lastRowIndex + 1); column++) {
                if((column >= row) && (column <= (2*lastRowIndex -row))) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
