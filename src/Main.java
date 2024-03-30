
public class Main {
    public static void main(String[] args) {
        int number = 7;
        int range = 20;
        addEvevNumber(number, range);
    }


    public static void addEvevNumber(int i, int range) {
        int result = 0;
        if (i > range) {
            System.out.println("za duża liczba");
        } else if (i < range) {
            for (int j = 0; j < i; j++) {
                if (j % 2 == 0) {
                    result = j + j;
                }
            }
            System.out.println(result);
        }
    }
}