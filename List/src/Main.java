import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "yi");
        map.put(2, "er");
        map.put(3, "san");
        System.out.println(map);
        System.out.println(map.keySet()); // 1 2 3
        System.out.println(map.values()); // yi er san
        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });
    }
}
