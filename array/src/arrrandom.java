import java.util.Random;

public class arrrandom {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();

        for(int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100);
            arr[i] = number;
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            System.out.println("数组中所有数据的和是:" + sum);
        }
        int avg = sum / arr.length;
        System.out.println("数组中的平均数为:" + avg);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < avg){
                count++;
            }
        }
        System.out.print("一共有"+ count + "个数据比平均数小");
    }
}

