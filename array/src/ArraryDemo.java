public class ArraryDemo {
    public static void main(String[] args) {



        int[] arr = {1,2,3,4,5,6,7,8,9};

        arr[0] = 2;
        int num = arr[0];
        System.out.println(num);



        //遍历数组
         for (int i = 0; i < arr.length; i ++){
             System.out.println(arr[i]);
         }
    }
}

