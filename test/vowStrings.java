package test;

public class vowStrings {
    static String find(int input3,String[] input2){
        String vowels = "aeiouAEIOU";
        String result = "";
        for(String i : input2){
            if( vowels.contains(Character.toString(i.charAt(0))) && 
                vowels.contains(Character.toString(i.charAt(i.length()-1)))){
                result += i.toLowerCase();
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String[] str = {"oreO","Hello","sirish","Apple"};
        System.out.println(find(str.length,str));
    }
}
