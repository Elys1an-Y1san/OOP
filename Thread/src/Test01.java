public class Test01 {
    public class testThread extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("subthread " + i);
            }
            testThread t = new testThread();
            t.start();
             
        }
    }
}
