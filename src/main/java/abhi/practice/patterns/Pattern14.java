    package abhi.practice.patterns;

/**
 *    A
 *    A B
 *    A B C
 *    A B C D
 *    A B C D E
 */
public class Pattern14 {
    public static void main(String[] args) {
        System.out.println("First pattern is:");
        createPattern(4);
        System.out.println("\n");
        System.out.println("Second pattern is:");
        createPattern(5);
    }

    private static void createPattern(int numOfRows) {

        for (int row = 0; row < numOfRows; row++) {
            char initValue = 65;
            for (int col = 0; col <= row; col++) {
                System.out.print(initValue);
                initValue++;
            }
            System.out.println();
        }
    }
}
