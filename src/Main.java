import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        int numberCars = 0;
        numberCars = getAnInt(numberCars);
        System.out.println(Arrays.toString(carFactory.carTable(numberCars)));
    }

    private static int getAnInt(int numberCars) {
        try {
            System.out.println("podaj ilośc pojazdów");
           numberCars = Integer.parseInt(sc.nextLine());

        }catch (Exception e){
            System.out.println("Co to a lipa ");
        }
        return numberCars;
    }
}
