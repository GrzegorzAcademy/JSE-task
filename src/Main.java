
public class Main {
    public static void main(String[] args) {
        int i = 14;
        liste(i);
    }

    private static void liste(int i) {
        for (int j = 0; j <= i; j++) {
            if (j % 2 == 0) {
                continue;
            }
            if (j % 11 == 0) {
                break;
            }
            System.out.println(j);
        }
    }
}
