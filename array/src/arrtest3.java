public class arrtest3 {
    public static void main(String[] args) {
        int[] arr = {33, 44 ,55 ,66, 86};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
