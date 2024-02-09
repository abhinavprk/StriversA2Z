    package abhi.practice.patterns;

/**
 *  *          *
 *  **        **
 *  ***      ***
 *  ****    ****
 *  *****  *****
 *  ************
 *  *****  *****
 *  ****    ****
 *  ***      ***
 *  **        **
 *  *          *
 *
 */
public class Pattern20 {
    public static void main(String[] args) {
        System.out.println("First pattern is:");
        createPattern(3);
        System.out.println("\n");
        System.out.println("Second pattern is:");
        createPattern(6);
    }

    private static void createPattern(int numOfRows) {
        var columns = (2*numOfRows) - 1;
        //First half
        for (int row = numOfRows-1; row > 0; row--) {
            for (int col = 0; col <= columns; col++) {
                if((col <= (numOfRows - (row + 1))) || (col >= (numOfRows + row))){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //Second half
        for (int row = 0; row < numOfRows; row++) {
            for (int col = 0; col <= columns; col++) {
                if((col <= (numOfRows - (row + 1))) || (col >= (numOfRows + row))){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
