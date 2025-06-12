public class MaxThreeElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 23, 16, 7, 77, 98, 63, 4, 5, 6, 8, 56,77 };
        System.out.println(FindMaxThree(arr));
    }

    private static int FindMaxThree(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max1) {
                max3 = max2;
                max2 = max1;
                max1 = i;
            } else if (i > max2) {
                max3 = max2;
                max2 = i;
            } else if (i > max3) {
                max3 = i;
            }
        }
        System.out.println(max1 + " " + max2 + " " + max3);
        return max1 + max2 + max3;
    }
}
