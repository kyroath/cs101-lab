import java.util.Scanner;

/**
 * __Sum & Count___
 * @author __Fatih Karahan___
 * @version __02/11/17__
 */

public class lab04b {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );

        // constants

        // variables

        int numberOfInputs;
        int sum;
        int count;
        int min;
        int max;
        int input;

        // program code

        System.out.format( "Number of Inputs: " );
        numberOfInputs = scan.nextInt();

        count = sum = 0;
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;

        while ( count < numberOfInputs ) {

            input = scan.nextInt();
            sum += input;

            if ( input > max )
                max = input;

            if ( input < min )
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
