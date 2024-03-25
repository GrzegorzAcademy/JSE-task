import java.time.LocalDate;

public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    void printName() {
        System.out.println(name);
    }

    LocalDate getExamDate() {
        int day = (int) Math.floor((Math.random() * 12) + 1);
        int month = (int) Math.floor((Math.random() * 31) + 1);
        LocalDate localDate = LocalDate.of(2024, (int) day, (int) month);
        return localDate;
    }
}

