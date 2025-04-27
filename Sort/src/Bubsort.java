import javax.swing.tree.TreeNode;

public class Bubsort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 4, 7, 8, 9};
    }

    public static void sort(int[] arr) {
    for (int i = 0; i < arr.length; i ++) {
        boolean flag = false;
        for (int j = i; j < arr.length - i - 1; j ++) {
            if(arr[j] > arr[i]) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                flag = true;
            }
        }
        if(!flag) {
            break;
        }
    }


    }
}
