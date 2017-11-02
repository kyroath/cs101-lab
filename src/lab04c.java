import java.util.Scanner;

/**
 * __Sum & Count___
 * @author __Fatih Karahan___
 * @version __02/11/17__
 */

public class lab04c {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );

        // constants

        // variables

        int input;
        int sum;
        int count;
        int max;
        int min;

        // program code

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        sum = count = 0;

        while ( ( input = scan.nextInt() ) >= 0 ) {

            sum += input;

            if ( max < input )
                max = input;

            if ( min > input )
                min = input;

            count++;

        }

        System.out.format( "The count of numbers: %d\n" +
                "The sum of numbers: %d\n" +
                "The average of numbers: %.2f\n" +
                "The minimum number: %d\n" +
                "The maximum value: %d\n", count, sum, ( float ) sum / count, min, max );


    }

}
