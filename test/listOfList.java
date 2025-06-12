package test;

import java.util.*;

public class listOfList {
    void main(){
        ArrayList<List<Integer>> x = new ArrayList<>();
        for(int i=0; i<3; i++){
            List<Integer> temp = new ArrayList<>();
            int n = (int)(Math.random()*10);
            System.out.println("n="+n);
            for(int j=0;j<=n;j++)
                temp.add((int)((Math.random()) * 256));
            Collections.sort(temp, Collections.reverseOrder());
            x.add(i ,temp);
        }
    }
}
