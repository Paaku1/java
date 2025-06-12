import java.util.Arrays;

public class twoDArr {
    public static void main(String[] args) {
        int max = 0;
        int[][] arr = {{1,2,3},{1,2,3},{1,2,3}};
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=0;j<arr[i].length;j++){
                sum += arr[i][j];
            }
            max = Math.max(max,sum);
        }
        System.out.println(max);

    }
}
