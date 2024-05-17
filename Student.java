import java.time.LocalDate;
import java.time.Period;

public class Student {
    private String name;
    private int age;

    public Student(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.age = Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public void Name() {
        System.out.println("Name:"+name);
    }

    public void getAge() {
        System.out.println("Age:"+age);
    }

    public static void main(String[] args) {
        Student student1 = new Student("John Doe", LocalDate.of(2004, 12, 3));
        student1.Name();
        student1.getAge();
    }
}