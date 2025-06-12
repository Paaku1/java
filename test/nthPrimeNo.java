package test;

import java.util.Arrays;
public class nthPrimeNo {
    static int[] findEncoder(int[] input1, int input2){
        int x = nthPrime(input2);
        for (int i = 0; i < input1.length; i++) {
            input1[i] = input1[i] + x;
        }
        return input1;
    }

    static int nthPrime(int n) {
        int num = 1, count = 0, i;
        while (count < n) {
            num = num + 1;
            for (i = 2; i <= num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num) {
                count = count + 1;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int i2 = 6;
        System.out.println(Arrays.toString(arr));
        arr = findEncoder(arr,i2);
        System.out.println(Arrays.toString(arr));
    }
}
