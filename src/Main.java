

public class Main {
    public static void main(String[] args) {

        MyEnum myEnum;
        MyEnum yellow = MyEnum.YELLOW;
        int ordinal = yellow.ordinal();
        for (MyEnum myEnum1:MyEnum.values()) {
            System.out.println(myEnum1);
        }
            System.out.println(ordinal);
        }


    private enum MyEnum{
        BLACK,
        YELLOW,
        GREEN;

    }

}


