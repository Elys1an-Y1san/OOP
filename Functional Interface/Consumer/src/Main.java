import java.util.function.Consumer;

public class Main {
    private static final Consumer<Student> STUDENT_CONSUMER = student -> System.out.println(student + "good");

    public static void main(String[] args) {
        student student = new Student();
        STUDENT_CONSUMER.accept(student);
    }


    public static class Student {
        public void hello() {
            System.out.println("hello");
        }
    }
}