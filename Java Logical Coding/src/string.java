public class string {
    public static void main(String args[]) {
        String s1 = "malayalam";
        String r = "";
        for(int i=s1.length()-1;i>=0;i--){
            r += s1.charAt(i);
        }
        System.out.println(r+"\n"+s1);
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1.equals(str2));
        // StringBuffer x = new StringBuffer("hello");
        // System.out.println(x.reverse());
    }
}
