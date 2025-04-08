import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try (FileInputStream stream = new FileInputStream("text.txt")){
            byte[] bytes = new byte[stream.available()];
            stream.read(bytes);



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}