import java.util.Random;

public class test {

    public static void main(String[] args) {
        Random random = new Random();
        random.
                ints(-100,100) // 生成-100 - 100
                .limit(10) // 只获取前10
                .filter(i -> i < 0) // 只保留小于0
                .sorted() //从小到大
                .forEach(System.out::println); //依次打印

    }
}
