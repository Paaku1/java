package test;

class call {
    public int sum(int a, int b) {
        return a + b;
    }
}

public class classesTest {

    static int sum(int z,int b){
        return z+z+b;
    }
    
    public static void main(String[] args) {
        call obj = new call();
        System.out.println(obj.sum(1,2));
    }
}
