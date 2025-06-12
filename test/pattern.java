package test;

import java.util.*;

public class pattern {
    public static int pivotInteger(int n) {
        int[] prefs = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            prefs[i] = prefs[i - 1] + i;
        }

        for (int i = 1; i < n + 1; i++) {
            if (prefs[i] == prefs[n] - prefs[i - 1])
                return i;
        }

        return -1;
    }
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        // List<Integer> x = new ArrayList<>();
        // for (int i = 1; i <= n; i++) {
        //     x.add(i);
        // }
        // int i = 0;
        // int j = n - 1;
        // int p = 1;
        // while(p<n-2){
        //     int s1 = 0;
        //     int s2 = 0;
        //     for(int c=0;c<=p;c++){
        //         s1 += x.get(c);
        //     }
        //     for(int c=p;c<n;c++){
        //         s2 += x.get(c);
        //     }
        //     if(s1 == s2){
        //         System.out.println(p+1);
        //     }
        //     p++;
        // }
        System.out.println(pivotInteger(n));
    }
}