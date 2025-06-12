import java.util.Arrays;

public class duplicateInteger {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6 };
        // int[] nums = { 1, 1, 1, 1 };
        // int[] nums = { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(findElement(nums)));
    }

    private static int[] findElement(int[] nums) {
        int len = 1;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[len++] = nums[i];
            }
        }
        if (len == 1)
            return new int[2];
        return new int[] { nums[1], nums[len - 2] };

    }
}
