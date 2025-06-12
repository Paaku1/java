
import java.util.*;

public class primeFactor {
    public static void main(String[] args) {
        int n = 72;
        List<Integer> list = factors(n);
        int sum = 0;
        System.out.println(list);
        for(int i : list){
            sum += i;
        }
        System.out.println(sum);
    }

    private static List<Integer> factors(int n) {
        List<Integer> list= new ArrayList<Integer>();
        while(n%2==0){
            list.add(2);
            n/=2;
        }
        for(int i=3;i<=n;i+=2){
            while(n%i==0){
                list.add(i);
                n/=i;
            }
        } if(list.isEmpty()){
            list.add(n);
        }
        return list;
    }
}
