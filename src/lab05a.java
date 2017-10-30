import java.util.Scanner;

public class lab05a {

    public static void main(String[] args) {

        String toContinue = "y";

        Scanner scan = new Scanner(System.in);

        do {

            byte column = scan.nextByte();
            byte row = scan.nextByte();
            byte thickness = scan.nextByte();

            scan.nextLine();

            boolean checkIfHole = false;
            boolean allPositive = (column > 0 && row > 0 && thickness > 0);

            if (!allPositive)
                System.out.println("All values must be positive!");

            if (allPositive) {
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        if (i >= thickness && i < row - thickness) {
                            if (j >= thickness && j < column - thickness) {
                                System.out.print(" ");
                                checkIfHole = true;
                            } else
                                System.out.print("*");
                        } else
                            System.out.print("*");
                    }
                    System.out.print(System.lineSeparator());
                }
            }

            if (!checkIfHole && allPositive)
                System.out.println("There is no hole!");

            System.out.println("Do you want to continue?");
            toContinue = scan.nextLine();

        } while (toContinue.charAt(0) == 'y' || toContinue.charAt(0) == 'Y');

    }

}
