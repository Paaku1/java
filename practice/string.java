package practice;
public class string {
    public static void main(String args[]){
        String a = "Hello World";
        String b = "";
        for(int i=0;i<a.length();i++){
            b = a.charAt(i) + b ;
        }
        System.out.println(b);
    }
}
