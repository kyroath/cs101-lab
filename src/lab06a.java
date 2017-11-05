import java.util.Scanner;

/**
 * __Methods___
 * @author __Fatih Karahan___
 * @version __02/11/17__
 */


public class lab06a {

    private static double power(double number, int power) {

        // constants

        // variables

        double result;

        // program code


        if (power < 0)
            return -1;

        if (number == 0)
            return 0;

        result = 1;

        for (int i = 0; i < power; i++)
            result *= number;

        return result;
    }

    private static int factorial(int number) {

        // constants

        // variables

        int result;

        // program code


        if (number < 0)
            return -1;

        result = 1;

        for (int i = number; i > 0; i--)
            result *= i;

        return result;

    }

    private static String reverse(String str) {

        // constants

        // variables

        String res;

        // program code

        res = "";

        for (int i = str.length() - 1; i >= 0; i--)
            res += str.charAt(i);

        return res;

    }

    private static int toDecimal(String base2) { // return Integer.parseInt(base2, 2); <- Standard Library

        // constants

        // variables

        int result, numericValue;
        double powerOf;

        // program code

        result = 0;

        for (int i = base2.length() - 1, count = 0; i >= 0; i--, count++) {

            numericValue = Character.getNumericValue(base2.charAt(i));
            powerOf = power(2, count);

            result += ( numericValue * (int) powerOf );

        }

        return result;

    }

    private static String toBinary(int base10) { // return Integer.toBinaryString(base10); <- Standard Library

        // constants

        // variables

        String result;

        // program code

        result = "";

        for (int i = base10; i != 0; i /= 2)
            result += Integer.toString(i % 2);

        return result;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // constants

        // variables

        String base2First, base2Second, str;
        String[] parts;
        double x, sum;

        // program code

        System.out.format("1st question: print exponent table\n");

        for (int i = -1; i <= 10; i++) {

            for (int j = 0; j < 4; j++)
                System.out.format("%-4d ", (int)power(i, j));

            System.out.format("\n");

        }

        System.out.format("\n\n");

        // ------------------------------------------------------------

        System.out.format("2nd question: factorial table\n");

        for (int i = 1; i <= 15; i++)
            System.out.format("%-3d\t%-10d\n", i, factorial(i));

        // ------------------------------------------------------------

        System.out.format("\n3rd question: binary sum\n");

        base2First = scan.next();
        base2Second = scan.next();

        System.out.format("%s", toBinary(toDecimal(base2First) + toDecimal(base2Second)));

        System.out.format("\n\n");

        // ------------------------------------------------------------

        System.out.format("4th question: taylor series\n");

        x = scan.nextFloat();
        sum = 0;

        for (int n = 0; n <= 10; n++) {

            sum += power(-1, n) * power(x, 2 * n + 1) / factorial(2 * n + 1);

            System.out.format("1:\t%,-5d 2\t:%4d\t 3:\t%,-15f 4:\t%,-20d 5:\t%,-15f 6:\t%,-15f\n",
                    n, // 1st
                    (int)power(-1, n), // 2nd
                    power(x, (2 * n + 1)), // 3rd
                    factorial(2 * n + 1), // 4th
                    sum, // 6th
                    Math.sin(x)); // 7th

        }

        scan.nextLine();
        System.out.format("\n");

        // ------------------------------------------------------------

        System.out.format("5th question: String reverse\n");

        str = scan.nextLine();
        parts = str.split(" ");

        for (int i = 0; i < parts.length; i++) {

            System.out.format("%s", reverse(parts[i]));

            if (i != parts.length - 1)
                System.out.format(" ");

        }

    }
}