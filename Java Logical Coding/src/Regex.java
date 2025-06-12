public class Regex{
    public static void main(String[] args) {
        String patten = "[a-z][A-Z]";
        System.out.println("abc".matches(patten));
    }
}