package arrays;

import java.util.Arrays;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 7, 3, 0, 2, 5, 8 };
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 2]);
    }
}
