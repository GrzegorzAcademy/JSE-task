

public class Main {
    public static void main(String[] args) {


        countEven(20);
    }

    public static void countEven(int x) {
        int count = 1;
        if (x > 0 && x % 2 != 0) {
            for (int i = 0; i < x; i++) {
                if (i % 5 == 0) continue;
                count *= i;
            }
            System.out.println(count);
        } else {
            System.out.println("bład");
        }
    }
}
