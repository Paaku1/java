package test;

class outer {
    int x = 15;

    class inner1 {
        int x = 10;
        class inOfInner{
            int x = 40;
        }
    }

    class inner2 {
        int x = 20;
    }
}

public class innerClass {
    public static void main(String[] args) {
        outer outer = new outer();
        outer.inner1 i1 = outer.new inner1();
        outer.inner2 i2 = outer.new inner2();
        outer.inner1.inOfInner ofInner = i1.new inOfInner(); 
        System.out.println("Outer class: " + outer.x);
        System.out.println("Inner class 1: " + i1.x);
        System.out.println("Inner class 2: " + i2.x);
        System.out.println("Inner of Inner class: " + ofInner.x);
    }
}
