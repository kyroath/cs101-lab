import java.util.Scanner;

/**
 * __Draw Triangle___
 * @author __Fatih Karahan___
 * @version __02/11/17__
 */

public class lab04d {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // constants

        // variables

        String temp;
        char character;
        int size;
        int i;
        int j;

        // program code

        i = j = 0;

        temp = scan.next();
        character = temp.charAt(0);
        size = scan.nextInt();

        while (i < size) {

            j = 0;
            while (j < i + 1) {

                System.out.format("%c", character);
                j++;
            }

            if (i != size - 1)
                System.out.format("\n");
            i++;
        }

    }

}
