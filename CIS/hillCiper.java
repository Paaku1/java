package CIS;

import java.util.*;
public class hillCiper {
    static void getKey(String key, int keyMat[][]){
        int k = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                keyMat[i][j] = (key.charAt(k)) % 26;
                k++;
            }
        }
    }
    static void hillCipher(String key,String txt){
        int [][]keyMat = new int[3][3];
        getKey(key,keyMat);

        int [][]vctr = new int[3][1];
        
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Plain Text: ");
        String txt = s.nextLine().toUpperCase();
        System.out.println("Enter the Key: ");
        String key = s.nextLine().toUpperCase();

        hillCiper(key,txt);
    }
}
