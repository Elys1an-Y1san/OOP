import java.util.Scanner;

public class factorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        factorials obj = new factorials();
        long result = obj.factorial(num);
        System.out.println(result);

    }
    public long factorial(int num) {
        long result = 1;
        for( int i = 1; i <= num; i++){
            result *= i;
        }
        return result;
    }
}
