public class arrtest2 {
    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5,6,7,8,9};

        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 3 == 0) {
                count++;
            }
        }
        System.out.println("能被3整除的数字有" + count + "个");
    }
}
