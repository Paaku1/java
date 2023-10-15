package arrays;

import java.util.*;

public class shiftZeros {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 0, 4, 6, 0, 9, 0, 8 };
        System.out.println("Before Shifting: " + Arrays.toString(arr));
        shiftZero(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void shiftZero(int[] nums) {
        int i = 0;
        int j = 0;
        int t;
        int n = nums.length;
        for (i = 0; i < n; i++) {
            if (nums[i] != 0) {
                t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                j++;
            }
        }
    }
}
