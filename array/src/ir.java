import java.util.*;

public class ir {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h"));

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());        /// 使用完一次要再次申请一次
        }


    }
}
