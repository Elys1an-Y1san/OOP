public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Xiaoming";
        person.age = 18;
        person.gender = "male";
        person.hi();
        int result = person.sum(1, 2);
        System.out.println(result);
    }
}
