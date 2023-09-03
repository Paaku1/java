public class rec {
    public static int sum(int a){
        if(a>0){
            return a + sum(a-1);
        }
        else{
            return 0;
        }
    }
    public static void main(String args[]){
        int r = sum(10);
        System.out.println("SUM: "+r);
    }
}
