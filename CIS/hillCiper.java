import java.util.*;
public class hillCiper {
    static void getKey(String key, int keyMat[][]){
        int k = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                keyMat[i][j] = (key.charAt(k)) % 65;
                k++;
            }
        }
    }
    static void getMsg(String txt,int msgMat[][]){
        int k = 0;
        for(int i=0;i<3;i++){
            msgMat[i][0] = (txt.charAt(k)) % 65;
            k++;
        }
    }
    static void getCipher(int keyMat[][],int msgMat[][],int cipMat[][]){
        for(int i=0;i<3;i++){
            for(int j=0;j<1;j++){
                for(int x = 0;x<3;x++){
                    cipMat[i][j] += keyMat[i][x] * msgMat[x][j];
                }
                cipMat[i][j] =  cipMat[i][j] % 26;
            }
        }
    }
    static void hillCipher(String key,String txt){
        int [][]keyMat = new int[3][3];
        getKey(key,keyMat);

        int [][]msgMat = new int[3][1];
        getMsg(txt, msgMat);

        int [][]cipMat = new int[3][1];
        getCipher(keyMat,msgMat,cipMat);

        String cipTxt = new String();
        cipTxt = "";
        for(int i=0;i<3;i++){
            cipTxt += (char)(cipMat[i][0] + 65);
        }
        
        for(int i=0;i<3;i++){
            System.out.print(cipTxt.charAt(i));
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Plain Text: ");
        String txt = s.nextLine().toUpperCase();
        System.out.println("Enter the Key: ");
        String key = s.nextLine().toUpperCase();

        hillCipher(key,txt);
    }
}
