import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("aaaa", "bbbbb", "cfwe", "dyhth", "gree", "ggf", "gg", "ch"));
        list.stream()
                .filter(str -> str.length() >   3)
                .filter(str -> str.charAt(0) < 'A' && str.charAt(0) > 'Z')
                .distinct() //  去重
                .collect(Collectors.toList());


    }



}
