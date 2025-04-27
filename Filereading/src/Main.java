import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        File file = new File ("text.txt");
        try (FileInputStream in = new FileInputStream(file);
            FileOutputStream out = new FileOutputStream("xxx.txt")){
            byte[] bytes = new byte[1024];
            int len;
            long total = file.length(), sum = 0;
            while ((len= in.read(bytes)) != -1) {
                out.write(bytes, 0 , len);
                sum += len;
                System.out.println(sum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}