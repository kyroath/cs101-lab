import java.util.Scanner;

/**
 * __Methods___
 * @author __Fatih Karahan___
 * @version __02/11/17__
 */


public class lab06aoriginal {

    private static double power(double number, int power) {

        if (power < 0)
            return -1;

        if (number == 0)
            return 0;

        double result = 1;

        for (int i = 0; i < power; i++)
            result *= number;

        return result;
    }

    private static int factorial(int number) {

        if (number < 0)
            return -1;

        int result = 1;

        for (int i = number; i > 0; i--)
            result *= i;

        return result;

    }

    private static String reverse(String str) {

        String res = "";

        for (int i = str.length() - 1; i >= 0; i--)
            res += str.charAt(i);

        return res;

    }

    private static int toDecimal(String base2) {

        // return Integer.parseInt(base2, 2);

        int result = 0;

        for (int i = base2.length() - 1, count = 0; i >= 0; i--, count++) {

            int numericValue = Character.getNumericValue(base2.charAt(i));
            double powerOf = power(2, count);

            result += ( numericValue * (int) powerOf );

        }
        return result;

    }

    private static String toBinary(int base10) {

        // return Integer.toBinaryString(base10);

        String result = "";

        for (int i = base10; i != 0; i /= 2)
            result += Integer.toString(i % 2);

        return result;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 1st question: print exponent table

        for (int i = -1; i <= 10; i++) {

            for (int j = 0; j < 4; j++)
                System.out.format("%-4d ", (int)power(i, j));

            System.out.format("\n");

        }

        System.out.format("\n\n");

        // 2nd question: factorial table

        for (int i = 1; i <= 15; i++)
            System.out.format("%-3d\t%-10d\n", i, factorial(i));

        // 3rd question: binary sum

        String base2First, base2Second;

        base2First = scan.next();
        base2Second = scan.next();

        System.out.format("%s", toBinary(toDecimal(base2First) + toDecimal(base2Second)));

        System.out.format("\n\n");

        // 4th question: taylor series

        double x = scan.nextFloat();
        double sum = 0;

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
        System.out.format("\n\n");

        // 5th question: String reverse

        String str = scan.nextLine();
        String[] parts = str.split(" ");

        for (int i = 0; i < parts.length; i++) {

            System.out.format("%s", reverse(parts[i]));

            if (i != parts.length - 1)
                System.out.format(" ");

        }

    }
}