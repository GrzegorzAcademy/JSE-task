import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberInteger = 0;
        boolean isTrue = true;
        System.out.println("podaj liczbę : ");
        do {
            try {
                numberInteger = sc.nextInt();
                isTrue = false;
                System.out.println(numberInteger);

            } catch (InputMismatchException e) {
                System.out.println("błędna wartość, spróbuj jeszcze raz");
                sc.nextLine();
            }
        } while (isTrue);
        System.out.println("podałeś " + numberInteger);
        sc.close();
    }

}


