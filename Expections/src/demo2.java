public class demo2 {
    public class expectionDemo2 {
        public static void main(String[] args) {
            try {
                calc();
            }catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("end");

        }


        public static int calc()throws ArithmeticException {
            int a = 19;
            int b = 10;
            int result = a/b;
            return result;
        }
    }
}
