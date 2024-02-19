package test;

class SubClass extends SuperClass{
    String model = "Pixel";
    public static void main(String[] args) {
        SubClass x = new SubClass();
        System.out.println(x.brand+" "+x.model+" "+x.modelNo());
    }

}