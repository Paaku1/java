package Wrapper;

public class TestWrapper {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = new Integer(num); // boxing
        Integer num2 = num; // auto boxing
        
        int num3 = num2.intValue();// unboxing
        int num4 = num2; // auto unboxing

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Unboxing: "+num3);
        System.out.println("auto Unboxing: "+num4);
    }
}
