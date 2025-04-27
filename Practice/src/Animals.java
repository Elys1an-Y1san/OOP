public class Animals {

    private String name;
    private int age;
    public Animals(String Myname, int Myage) {
        name = Myname;
        age = Myage;
    }

    public void ate(){

        System.out.println(name + "is eating");

    }

    public void name() {
        System.out.println("my name is " + name);
    }

    public void intro() {
        System.out.println("my name is" + name + " and age is" + age);

    }

}

