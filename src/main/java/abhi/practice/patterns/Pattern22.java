package abhi.practice.patterns;

/**
 * 4 4 4 4 4 4 4
 * 4 3 3 3 3 3 4
 * 4 3 2 2 2 3 4
 * 4 3 2 1 2 3 4
 * 4 3 2 2 2 3 4
 * 4 3 3 3 3 3 4
 * 4 4 4 4 4 4 4
 */
public class Pattern22 {
    public static void main(String[] args) {
        System.out.println("First pattern is:");
        createPattern(4);
        //System.out.println("\n");
        //System.out.println("Second pattern is:");
        //createPattern(7);
    }

    private static void createPattern(int rows) {
        int columns = 2 * rows;
        for (int row = 0; row < columns; row++) {
            for (int col = 0; col < columns; col++) {
                if((row == 0) || (row == (columns - 1)) || (col == 0) || (col == (columns - 1))){
                    System.out.print(rows + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
