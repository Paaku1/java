

class A{
    void display() {
        System.out.println("Class A");
    }
    void test(){
        System.out.println("Test method of class A");
    }
}

class B extends A {
    void display() {
        super.display();
        System.out.println("Class B");
    }
}

class C extends B {
    void display() {
        super.display();
        System.out.println("Class C");
    }
}

class D extends C{
    void display() {
        super.display();
        System.out.println("Class D");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        D obj = new D();
        obj.test();
    }
}
