package CIS;
import java.util.*;
//1E
public class railFence{
    public static String encrypt(String s){
        StringBuffer r = new StringBuffer();
        int n = s.length();
        for(int i=0;i<n;i++){
            if(i%2==0)
                r.append(s.charAt(i));
        }
        for(int i=0;i<n;i++){
            if(i%2!=0)
                r.append(s.charAt(i));
        }
        return r.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Plain Text: ");
        String s = sc.nextLine();
        System.out.println("Encrypted Cipher Text: "+encrypt(s));
        sc.close();
    }
}