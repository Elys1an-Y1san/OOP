import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class buffer {
    public static void main(String[] args) {
        try (BufferedInputStream stream = new BufferedInputStream(new FileInputStream(text.txt))) {
            System.out.println((char)    stream.read));
            System.out.println((char)    stream.read));

        } catch (
                IOException e
        ) {
            e.printStackTrace();
        }

    }
}
