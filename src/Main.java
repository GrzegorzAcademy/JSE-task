
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj liczbę całkowita, a ja powiem Ci czy liczba jest parzysta ");
        int number = sc.nextInt();

        isEvenSwitch(number);
        isEven(number);

    }

    public static void isEvenSwitch(int number) {
        switch (number % 2) {
            case 0 -> System.out.println("liczba jest parzsta, podałeś : " + number);
            case 1 -> System.out.println("Podana liczba jest liczba nieparzystą, podałeś :" + number);
            default -> System.out.println(" Nieprawidłowa liczba, podałeś :" + number);
        }
    }

    public static void isEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Liczba jest parzysta, podałeś : " + number);
        } else if (number % 2 == 1) {
            System.out.println("Podana liczba jest niearzysta, podałeś :" + number);
        } else {
            System.out.println("Nieprawidłowa liczba, podałeś : " + number);
        }

    }
}