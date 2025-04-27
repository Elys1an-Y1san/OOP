public class Q1 {

    public static void main(String[] args) {

        static void rotate(int[] arr){
            if (arr == null || arr.length == 0) {
                return;
            }

            int temp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = temp;
        }
    }

}
