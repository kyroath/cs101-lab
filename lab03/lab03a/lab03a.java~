import java.util.Scanner;

/**
 * __Lab03a for-if__
 * @author __Fatih Karahan__
 * @version __1.0.0__
 */

public class lab03a {
	public static void main( String[] args ) {
		Scanner scan = new Scanner(System.in);

		// Constants
		
		// Variables
		
		int oddSum = 0;
		int evenSum = 0;
		int userLimit;
		int userLimitSum = 0; // Sum of positive integers from 1 to userLimit
		// Program Code
		
		System.out.print("Enter the limit: ");	
		userLimit = scan.nextInt();

		for ( int x = 0; x <= 51; x++ ) {
			if ( x < 12 || x > 25 )
				System.out.format("%d is out of range 12-25" + System.lineSeparator(), x);
			
			if ( x % 2 == 0 )
				evenSum += x;
			else oddSum += x;

			if ( x % 5 == 0 )
				System.out.println("Hi Five");
			else if ( x % 2 == 0 )
				System.out.println("Hi Two");
			else if ( x % 7 == 0 || x % 3 == 0 )
				System.out.println("Hit ThreeOrSeven");
			else
				System.out.println("Hi Others!");

			if ( x <= userLimit )
				userLimitSum += x;
		}

		System.out.format("The total until %d is %d\n", userLimit, userLimitSum);
		if ( userLimitSum == ( userLimit * ( userLimit + 1 ) ) / 2 )
			System.out.println("Same!");
		else
			System.out.println("Different!");

	}
}
