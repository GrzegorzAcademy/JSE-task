import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            trowExeption();
        } catch (IOException e) {
            System.out.println("Exeption");
        }
    }


    public static void trowExeption() throws IOException {
        Scanner sc = new Scanner(System.in);
        try {
            int variable = sc.nextInt();
        } catch (Exception e) {
            System.out.println("trowExeption text");
        }

    }

}


