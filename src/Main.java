
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name1 = "Jan";
        String name2 = "Jan";
        System.out.println(name2 == name1);
        System.out.println(name2.equals(name1));
        System.out.println(name2.hashCode());
        System.out.println(name1.hashCode());
    }
}