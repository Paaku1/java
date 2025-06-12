import java.util.Arrays;

public class swapArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 5, 6, 7, 8 };
        System.out.println("before swap");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr1.length; i++) {
            int t = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = t;
            System.out.println(i+"\n"+Arrays.toString(arr1));
            System.out.println(Arrays.toString(arr2));
        }
        System.out.println("After swap");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
