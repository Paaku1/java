package practice;
public class add_method{
    public static void add(int a, int b){
        int x=a+b;
        System.out.println(x);
    }//integer addition
    public static void add(double a, double b){
        float y=(float)(a + b );
        System.out.print(y);
    }//decimal addition
    public static void main(String[] args){
        add(6,5);
        add(5.5,5.6);
    }
}