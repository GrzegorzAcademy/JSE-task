import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj zdanie podzielone kropkami " +
                " a powiem Ci ole kropek jest w zdaniu ");
        String s = sc.nextLine();
        char[] charArray = s.toCharArray();

        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '.')
                count++;
        }
        System.out.println(count);
    }
}