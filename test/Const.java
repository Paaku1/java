package test;

class Const {
    int x;

    public Const() {
        x = 10;
    }

    public static void main(String[] args) {
        Const obj = new Const();
        System.out.println(obj.x);
        
        Test k = new Test();
        int y = k.x;
        System.out.println(y);
    }
}
