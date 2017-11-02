import java.util.Scanner;

/**
 * __While loop & conditions___
 * @author __Fatih Karahan___
 * @version __02/11/17__
 */

public class lab04a {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );

        // Constants

        // Variables

        int limit;
        int index;
        int count;

        // Program code

        System.out.format( "Enter the limit: " );
        limit = scan.nextInt();

        System.out.format( "The numbers one line\n" );
        index = 0;
        while ( index < limit ) {

            if ( index != limit - 1 )
                System.out.format( "%d ", index );

            else
                System.out.format( "%d\n", index );

            index++;

        }

        System.out.format( "\n" );

        System.out.format( "The numbers five per line\n" );
        index = 0;
        while ( index < limit ) {

            System.out.format( "%d ", index );

            if ( index % 5 == 4 )
                System.out.format( "\n" );

            index++;

        }

        System.out.format( "\n\n" );

        System.out.format( "The numbers from n\n" );
        index = limit;
        while ( index >= 0 ) {

            if ( index != 0 )
                System.out.format( "%d ", index );

            else
                System.out.format( "%d\n", index );

            index--;

        }

        System.out.format( "\n" );

        System.out.format( "Even values from -n to n\n" );
        index = -1 * limit;
        while ( index <= limit ) {

            if ( index % 2 == 0 ) {

                System.out.format( "%d ", index );
                index += 2;

            }

            else
                index++;

        }

        System.out.format( "\n\n" );

        System.out.format("Squares of even values\n");
        index = 0;
        count = 0;
        while ( index <= limit ) {

            if ( index % 2 == 0 ) {

                System.out.format("%d ", index * index);
                count++;

                if ( count % 5 == 0 && count != 0 )
                    System.out.format( "\n" );


            }

            index++;

        }

        System.out.format( "\n\n" );

        System.out.format( "Divisible by 3 ^ 4\n" );
        index = limit;
        while ( index >= 3 ) {

            if ( ( index % 3 == 0 ) != ( index % 4 == 0 ) )
                System.out.format( "%d ", index );

            index--;

        }

        System.out.format( "\n\n" );

        System.out.format( "Divisors\n" );
        index = 2;
        while ( index <= limit ) {

            if ( limit % index == 0 )
                System.out.format( "%d ", index );

            index++;

        }

        System.out.format( "\n\n" );

        System.out.format( "1\\n\n" );
        index = limit;
        while ( index >= 1 ) {

            double doubleIndex = index;

            if ( 1 / doubleIndex > 0.01 )
                System.out.format( "%.2f ", 1 / doubleIndex );

            index--;

        }

        System.out.format( "\n" );

    }

}
