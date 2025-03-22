public class Person {
    int age;
    String name;
    String address;
    String sex;
    int phone;


    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    protected abstract void exam();
}
