public class CharDigitSum {
    public static int getLucky(String S, int k) {
        String s = "";
        for(char c:S.toCharArray()){
            int n = c-96;
            s += String.valueOf(n);
        }
        int sum = 0;
        int res = 0;
        while(k>0){
            String str = s;
            for(int i=0;i<str.length();i++){
                sum += Integer.parseInt(str.charAt(i)+"");
            }
            s = String.valueOf(sum);
            res = sum;
            sum = 0;
            k--;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(getLucky("leetcode",2));
    }
}
