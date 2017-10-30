import java.util.Scanner;

/**
 * __Draw tables with corresponding cells: Row&Column number, The Product, Cell Number, Only Rows___
 * @author __Fatih Karahan___
 * @version __30.10.2017__
 */


public class lab05b {

    public static void printSpaces(int until) {
        for (int i = 0; i < until; i++)
            System.out.print(" ");
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        byte row = scan.nextByte();
        byte column = scan.nextByte();

        boolean allPositive = (row > 0 && column > 0);

        System.out.println("The Table:" + System.lineSeparator());

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                printSpaces(3);
                System.out.format("%d,%d", i + 1, j + 1);
            }
            System.out.print(System.lineSeparator());
        }

        System.out.println(System.lineSeparator() + "The Product Table:" + System.lineSeparator());

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                printSpaces(5);
                System.out.format("%d", (i + 1) * (j + 1));
            }
            System.out.print(System.lineSeparator());
        }

        System.out.println(System.lineSeparator() + "The Cell Number:" + System.lineSeparator());

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                printSpaces(5);
                System.out.format("%d", (i * column + j));
            }
            System.out.print(System.lineSeparator());
        }

        System.out.println(System.lineSeparator() + "The Rows" + System.lineSeparator());

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                printSpaces(5);
                if ( j == 0)
                    System.out.print(i + 1);
                else
                    System.out.print("-");
            }
            System.out.print(System.lineSeparator());
        }


    }

}
