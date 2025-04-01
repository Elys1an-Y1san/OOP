import java.util.function.Supplier;

public class Main  {
    public static void main(String[] args) {
        Supplier<student> studentSupplier = student::new;

        studentSupplier.get().hello();
    }

    public static class student{
        public void hello(){
            System.out.println("hello");
        }
    }
}
