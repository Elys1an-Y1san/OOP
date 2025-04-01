public class mouse {
    private String name;
    private int id;
    public mouse(String myName, int myId){
        name = myName;
        id = myId;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void intro(){
        System.out.println(name + " is intro");
    }
}
