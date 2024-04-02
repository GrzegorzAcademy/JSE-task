import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean check = true;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("POdaj liczbę");
            int number = sc.nextInt();
            if (number % 3 == 0) {
                System.out.println("Wynik = " + number / 3);
                check = false;
            } else {
                System.out.println("POdana liczba nie dzili sie przz 3 bez reszty");

            }


        }while (check) ;
    }
}