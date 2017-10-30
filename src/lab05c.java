import java.util.Scanner;

/**
 * __A simple calculator capable of +,-.*,/,sin operations___
 * @author __Fatih Karahan___
 * @version __30.10.2017__
 */


public class lab05c {

    private static void printMenu( double value ) {
        System.out.format("------------------\n" +
                "[ %.2f ]\n" +
                "------------------\n" +
                "  +,-,*,/,sin value\n" +
                "  Clear\n" +
                "  Quit\n" +
                "------------------\n" +
                "Select: ", value);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean toContinue = true;
        double value = 0;
        String operation;
        double operatedNumber;

        do {

            printMenu(value);

            operation = scan.next();

            if (operation.equals("Quit") || operation.equals("quit") || operation.equals("Q") || operation.equals("q"))
                toContinue = false;

            else if (operation.equals("Clear") || operation.equals("clear") ||
                    operation.equals("c") || operation.equals("C"))
                value = 0;

            else if (operation.equals("+")) {
                operatedNumber = scan.nextDouble();
                value += operatedNumber;
            }

            else if (operation.equals("-")) {
                operatedNumber = scan.nextDouble();
                value -= operatedNumber;
            }

            else if (operation.equals("*")) {
                operatedNumber = scan.nextDouble();
                value *= operatedNumber;
            }

            else if (operation.equals("/")) {
                operatedNumber = scan.nextDouble();
                value /= operatedNumber;
            }

            else if (operation.equals("sin")) {
                value = Math.sin(value);
            }

        } while (toContinue);

    }

}
