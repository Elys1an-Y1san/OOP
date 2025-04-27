public class Sync {
    private static int i = 0;

    public static void main(String[] args) throws InterruptedException {

        Object o = new Object();

       new Thread(() -> {
           for (int j = 0; j < 10; j++) {
               synchronized (o) {
                   i++;
               }
       })

        }

    }
}
