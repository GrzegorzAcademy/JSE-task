import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double numberDouble = 0;
        try {
            System.out.println("Podaj liczbę ");
            numberDouble = sc.nextDouble();
            System.out.println("Podna wartość " + numberDouble);
        } catch (InputMismatchException e) {
            System.out.println("błędna wartość!");
        }


    }
}


