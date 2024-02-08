    package abhi.practice.patterns;

/**
 *    *
 *    * *
 *    * * *
 *    * * * *
 *    * * * * *
 *    * * * *
 *    * * *
 *    * *
 *    *
 */
public class Pattern10 {
    public static void main(String[] args) {
        System.out.println("First pattern is:");
        createPattern(4);
        System.out.println("\n");
        System.out.println("Second pattern is:");
        createPattern(7);
    }

    private static void createPattern(int numOfRows) {
        int totalRows = ((2 * numOfRows) - 1);
        int columns = 0;
        for (int row = 0; row < totalRows; row++) {
            if((row + 1) <= numOfRows){
                ++columns;
            } else {
                --columns;
            }
            for (int col = 0; col < columns ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
