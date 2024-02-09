    package abhi.practice.patterns;

/**
 *    1
 *    2 3
 *    4 5 6
 *    7 8 9 10
 *    11 12 13 14 15
 */
public class Pattern13 {
    public static void main(String[] args) {
        System.out.println("First pattern is:");
        createPattern(4);
        System.out.println("\n");
        System.out.println("Second pattern is:");
        createPattern(5);
    }

    private static void createPattern(int numOfRows) {
        int initValue = 1;
        for (int row = 0; row < numOfRows; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(initValue + " ");
                initValue++;
            }
            System.out.println();
        }
    }
}
