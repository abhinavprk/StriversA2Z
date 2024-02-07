package abhi.practice.patterns;

/**
 *    *
 *    * *
 *    * * *
 *    * * * *
 *    * * * * *
 */
public class Pattern2 {
    public static void main(String[] args) {
        System.out.println("First pattern is:");
        createPattern(4);
        System.out.println("\n");
        System.out.println("Second pattern is:");
        createPattern(6);
    }

    private static void createPattern(int numOfRows) {
        for (int row = 0; row <= numOfRows; row++) {
            for (int column = 0; column < row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
