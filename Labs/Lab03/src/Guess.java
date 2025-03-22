import java.util.Random;
import java.util.Scanner;


public class Guess {
    public static void main(String[] args) {
        Random random = new Random();
        int RandomNum = random.nextInt(100);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        while (true){
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            if (num > RandomNum){
                System.out.println("Your number is too high!");
            } else if (num < RandomNum) {
                System.out.println("Your number is too low!");
            } else {
                System.out.println("You guessed correctly!");
                break;
            }
        }
    }
}
