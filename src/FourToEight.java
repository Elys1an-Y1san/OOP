import java.util.Scanner;

public class FourToEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // todo: if-else
        if (num >= 4 && num <= 8) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}