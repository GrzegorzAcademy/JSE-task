import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj pierwszą liczbę");
        int number1 = sc.nextInt();
        System.out.println("Podaj drugą liczbę");
        int number2 = sc.nextInt();
        System.out.println("wynik = " + (number1 - number2));
    }
}
