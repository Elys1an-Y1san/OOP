public class Sort2 {

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1, 11, 14, 15, 13, 12, 10 , 9 };
    }
    private static int search(int[] arr, int target){
        int left = 0, right = arr.length - 1;
        int mid = (right + left) / 2;
        while (left <= right){
            int midval = arr[mid];
            if (midval < target)
                left = mid + 1;
            else if(midval > target)
                right = mid - 1;
            else
                return mid;
        }
        return -1;
    }
}
