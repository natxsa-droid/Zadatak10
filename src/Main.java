import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int broj = 0;
        boolean tocanUnos = false;
        while (tocanUnos) {
            System.out.print("Unesite broj: ");
            try {
                broj = scanner.nextInt();
                tocanUnos = true;
            }
            catch (InputMismatchException e) {
                System.out.println("Nije unešen broj.");
            }
        }


    }

}
