public class Worker extends Person implements Study{
    public Worker(){
        super("", 19, "");
    }
    public void work(){
        System.out.println("Worker " + name + " is working.");
    }

    @Override
    public void exam() {
        System.out.println("exam");
    }
    public void study(){
        System.out.println("study");
    }
    public void exam2(){

    }
}