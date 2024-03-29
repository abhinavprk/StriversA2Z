package abhi.practice.basic.math.digitsInANumber;

/**
 * Given an integer N, write a program to count the number of digits in N.
 */
public class FourthSolution {
    public static void main(String[] args) {
        System.out.println(countDigits(-41));
        /*System.out.println(countDigits(400));
        System.out.println(countDigits(-41));
        System.out.println(countDigits(1));
        System.out.println(countDigits(-1));*/
    }

    private static int countDigits(int input) {

        /*
            10^1 = 10             ----------> log10 10 = 1
            10^2 = 100            ----------> log10 100 = 2
            100 <10^2.x < 1000    -------->   log10 z = 2.x where 100 < z < 1000
            10^3 = 1000           ----------> log10 1000 = 3
            10^4 = 10000          ----------> log10 10000 = 4

            If the log10 of an int is x.yzr, then the number of digits in that int is x+1
         */
        //Take log of absolute value so that in case the input is negative the log value doesn't end as NaN
        return Double.valueOf(Math.log10(Math.abs(input))).intValue() + 1;
    }


}
