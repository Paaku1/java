import java.util.*;

public class grade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        int m1 = s.nextInt();
        int m2 = s.nextInt();
        int m3 = s.nextInt();
        int avg = (m1+m2+m3)/3;
        String res = (avg>= 80) ?  "A" : "B";
        System.out.println(res);
    }
}

