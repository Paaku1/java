package test;

public class getSet_II {
    public static void main(String[] args) {
        getSet x = new getSet();
        
        System.out.println(x.getTest());//getter 

        x.setTest("Changed test");//setter
        System.out.println(x.getTest());
    }
}
