package test;

abstract class abst1 {
    //int y = 1;
    public abstract void give();
}

class abst2 extends abst1 {
    public void give(){
        System.out.println("Hello");
    }
}

class abst {
    public static void main(String[] args) {
        abst1 x = new abst2();
        x.give();
        //System.out.println(x.y);
    }

}
