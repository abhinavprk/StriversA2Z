    package abhi.practice.patterns;

/**
 *   **********
 *   ****  ****
 *   ***    ***
 *   **      **
 *   *        *
 *   *        *
 *   **      **
 *   ***    ***
 *   ****  ****
 *   **********
 */
public class Pattern19 {
    public static void main(String[] args) {
        System.out.println("First pattern is:");
        //createPattern(4);
        //System.out.println("\n");
        //System.out.println("Second pattern is:");
        createPattern(10);
    }

    private static void createPattern(int numOfRows) {
        var halfRows = numOfRows/2;
        var columns = numOfRows - 1;
        //First half
        for (int row = 0; row < halfRows; row++) {
            for (int col = 0; col <= columns; col++) {
                if((col <= (halfRows - (row + 1))) || (col >= (halfRows + row))){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //Second half
        for (int row = halfRows-1; row >= 0; row--) {
            for (int col = 0; col <= columns; col++) {
                if((col <= (halfRows - (row + 1))) || (col >= (halfRows + row))){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
