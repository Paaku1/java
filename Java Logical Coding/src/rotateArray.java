import java.util.Arrays;

public class rotateArray {

    rotateArray(int[] arr, int i) {
        int k = i % arr.length;
        while (k > 0) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
            k--;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));
        System.out.println("Right Rotate: "+Arrays.toString(rightRotate(arr, arr.length, 3)));
        System.out.println("left Rotate: "+Arrays.toString(leftRotate(arr,arr.length,3)));
    }

    private static int[] leftRotate(int[] arr1,int n, int k) {
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr1[(i + k) % n];
        }
        return temp;
    }

    private static int[] rightRotate(int[] arr, int n, int k) {
        int[] temp = new int[n];//auxillary array
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }
        return temp;
    }
}
