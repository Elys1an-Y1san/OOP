package animals;


public class Mammal implements Animal {
    public void eat() {
        System.out.println("Mammal is eating");
    }
    public void sleep() {
        System.out.println("Mammal is sleeping");
    }

    public static void main(String[] args) {
        Mammal m = new Mammal();
        m.eat();
        m.sleep();
    }
}
