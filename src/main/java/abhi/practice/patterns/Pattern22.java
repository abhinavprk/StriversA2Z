package abhi.practice.patterns;


/**
 * 4 4 4 4 4 4 4
 * 4 3 3 3 3 3 4
 * 4 3 2 2 2 3 4
 * 4 3 2 1 2 3 4
 * 4 3 2 2 2 3 4
 * 4 3 3 3 3 3 4
 * 4 4 4 4 4 4 4

  The reverse pattern

 * 0 0 0 0 0 0 0
 * 0 1 1 1 1 1 0
 * 0 1 2 2 2 1 0
 * 0 1 2 3 2 1 0
 * 0 1 2 2 2 1 0
 * 0 1 1 1 1 1 0
 * 0 0 0 0 0 0 0
 *
 */
public class Pattern22 {
    public static void main(String[] args) {
        System.out.println("First pattern is:");
        createPattern(4);
        System.out.println("\n");
        System.out.println("Second pattern is:");
        createPattern(7);
    }

    private static void createPattern(int rows) {
        int columns = 2 * rows - 1;
        for (int top = 0; top < columns; top++) { // top is the distance of current index from top
            for (int left = 0; left < columns; left++) { // left is the distance of the current index from left
                int right = (columns - 1) - left; // right is the distance of the current index from right
                int bottom = (columns - 1) - top; // bottom is the distance of the current index from bottom
                //The value to be printed at every index is the minimum distance out of top, bottom, left, and right
                //subtracted from the rows
                int valueToPrint = rows - Math.min(Math.min(top,bottom), Math.min(left,right));
                System.out.print(valueToPrint + " ");
            }
            System.out.println();
        }
    }
}
