package abhi.practice.patterns;

/**
 *    * * * * *
 *    * * * * *
 *    * * * * *
 *    * * * * *
 *    * * * * *
 */
public class Pattern1 {
    public static void main(String[] args) {
        System.out.println("First pattern is:");
        createPattern(4,4);
        System.out.println("\n");
        System.out.println("Second pattern is:");
        createPattern(5,6);
    }

    private static void createPattern(int numOfRows, int numOfColumns) {
        for (int row = 0; row < numOfRows; row++) {
            for (int column = 0; column < numOfColumns; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
