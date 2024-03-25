
public class Main {
    public static void main(String[] args) {

        MyClass myClass1 = new MyClass();
        myClass1.number = 1;
        myClass1.text = "myClassText 1";
        MyClass myClass2 = new MyClass();
        myClass2.number = 2;
        myClass2.text = "MyClass 2";
        System.out.println(myClass1.number + " " + myClass1.text);
        System.out.println(myClass2.number + " " + myClass2.text);


    }
}