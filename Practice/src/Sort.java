public class Sort {
    public static void main (String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        sort(arr);
        System.out.println(arr);
    }
    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            for (int j = 1; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j +1]) {
                    int temp = arr[j + 1] ;
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
