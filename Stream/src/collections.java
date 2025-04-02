import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class collections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(Collections.max(list));
        Collections.sort(list);
        System.out.println(Collections.binarySearch(list, 4 ));
    }
}
