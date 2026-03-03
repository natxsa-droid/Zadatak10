import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int broj = 0;
        boolean tocanUnos = false;
        while (!tocanUnos) // NB! pazi na !, ako ga nema, neće ni raditi
             {
            System.out.print("Unesite broj: ");
            try {
                broj = scanner.nextInt();
                tocanUnos = true;
            }
            catch (InputMismatchException e) {
                System.out.println("Nije unešen broj.");
                scanner.nextLine();
            }
        }
        long rezultat = 1;
        for (int i = 1; i <= broj; i++) {
            rezultat *= i;
        }
        System.out.println(broj);
    }

}
