    package abhi.practice.patterns;

/**
 *          A
 *        A B A
 *      A B C B A
 *    A B C D C B A
 */
public class Pattern17 {
    public static void main(String[] args) {
        System.out.println("First pattern is:");
        createPattern(4);
        System.out.println("\n");
        System.out.println("Second pattern is:");
        createPattern(5);
    }

    private static void createPattern(int numOfRows) {
        int maxRowIndex = numOfRows - 1;
        int noOfColumns = ((numOfRows * 2) - 1);
        int centerColumn = (numOfRows + 1)/2;
        for (int row = 0; row < numOfRows; row++) {
            char initValue = 65;
            for (int col = 0; col < noOfColumns; col++) {
                if((col >= (maxRowIndex - row)) && (col <= (maxRowIndex + row))) {
                    System.out.print(initValue);
                    if(col > centerColumn){
                        initValue--;
                    } else {
                        initValue++;
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
