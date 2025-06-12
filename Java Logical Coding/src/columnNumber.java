public class columnNumber {
        public String convertToTitle(int columnNumber) {
            StringBuffer x = new StringBuffer();
            while(columnNumber != 0){
                int rem = columnNumber % 26;
                char c = (char) ('A'+rem-1);
                x.append(c);
                columnNumber /= 26;
            }
            return x.reverse().toString();
        }
        public static void main(String[] args) {
            columnNumber obj = new columnNumber();
            int columnNumber = 701; // Example input
            String result = obj.convertToTitle(columnNumber);
            System.out.println(result);
        }
}
