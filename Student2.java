public class Student2{
    String name = "Dhruva";
    int sem = 4;

    public void DisplayDetails() {
        System.out.println("Semester:" + sem);
        System.out.println("Name:" + name);
    }

    public class StudentCourses {
        String[] courses = {"C#", "ML", "DevOps"};
        int[] marks = {80, 70, 90};

        public void DisplayDetails() {
            System.out.println("Course:" + courses[0] + " Marks:" + marks[0]);
            System.out.println("Course:" + courses[1] + " Marks:" + marks[1]);
            System.out.println("Course:" + courses[2] + " Marks:" + marks[2]);
        }

        public static void main(String[] args) {
            Student2 s = new Student2();
            Student2.StudentCourses sc = s.new StudentCourses();
            s.DisplayDetails();
            sc.DisplayDetails();
        }
    }
}