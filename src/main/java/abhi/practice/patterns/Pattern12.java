    package abhi.practice.patterns;

/**
 *    1
 *    0 1
 *    1 0 1
 *    0 1 0 1
 *    1 0 1 0 1
 */
public class Pattern12 {
    public static void main(String[] args) {
        System.out.println("First pattern is:");
        createPattern(4);
        System.out.println("\n");
        System.out.println("Second pattern is:");
        createPattern(5);
    }

    private static void createPattern(int numOfRows) {
        for (int row = 0; row < numOfRows; row++) {
            int initValue = 1;
            int noOfColumns = 2 * numOfRows;
            for (int col = 0; col < noOfColumns ; col++) {
                if((col < row +1) || (col >= ((noOfColumns - (row + 1))))) {
                    if(col <= row){
                        System.out.print(initValue + " ");
                        initValue++;
                    } else if (col >= ((noOfColumns - (row + 1)))){
                        initValue--;
                        System.out.print(initValue + " ");
                    }
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
