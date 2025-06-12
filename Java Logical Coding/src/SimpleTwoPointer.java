import java.util.Arrays;

public class SimpleTwoPointer {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 0, 1, 9, 0, 5, 0 };
        int c = 0;
        // for(int i : arr){
        //     if(i != 0){
        //         System.out.print(i+" ");
        //     } else {
        //         c++;
        //     }
        // }
        // for(int i=0;i<c;i++){
        //     System.out.print(0+" ");
        // }
        for(int i:arr){
            if(i != 0){
                arr[c] = i;
                c++;
            }
        }
        for(int i = c;i<arr.length;i++){
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
