import java.util.Random;
import java.util.Scanner;

public class GuessRamdomNum {
    public static void main(String[] args) {
        Random random = new Random();
        int TarNum = random.nextInt(100) + 1;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of emails you want to guess: ");

        while (true) {
            System.out.println("Enter the number of: ");
            int num = sc.nextInt();
            if (num > TarNum) {
                System.out.println("Too high");
            }else if (num < TarNum) {
                System.out.println("Too low");
            } else {
                System.out.println("Correct");
                break;
            }
        }
    }

}
