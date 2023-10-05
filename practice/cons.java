package practice;
public class cons {
    private String TAG = "cons";//private
    public static void main(String[] args){
        profile paaku = new profile("karthi",20);
        System.out.println(paaku.name);
        System.out.println(paaku.age);
        cons tag = new cons();
        System.out.println(tag.TAG);
    }
}
