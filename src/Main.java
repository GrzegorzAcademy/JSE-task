import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Adam");
        Student student2 = new Student("Ewa");

        System.out.println("Student " + student1.getName() + " ma egzamin : " + student1.getExamDate());
        System.out.println("Student " + student2.getName() + " ma egzamin : " + student2.getExamDate());


    }
}