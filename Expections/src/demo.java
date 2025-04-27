public class demo {
    public static void main(String[] args) {
        System.out.println("Line1");
        int i = 10;
        try{
            System.out.println(i/0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException, 0");
        }


    }
}
