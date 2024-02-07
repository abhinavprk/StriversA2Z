package abhi.practice.patterns;

/**
 *    1
 *    1 2
 *    1 2 3
 *    1 2 3 4
 *    1 2 3 4 5
 */
public class Pattern3 {
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
                System.out.print((column+1) + " ");
            }
            System.out.println();
        }
    }
}
