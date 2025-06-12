import java.util.*;

public class parenthesis {
  static boolean isValid(String s){
    Stack<Character> x = new Stack<>();
    String open = "([{";
    String close = ")]}";
    for(char i : s.toCharArray()){
      if(close.indexOf(i) != -1){
        if(x.isEmpty()){
          return false;
        }
        else if(close.indexOf(i)==open.indexOf(x.peek())){
          x.pop();
        }
      }
      if(i == '(' || i == '[' || i == '{'){
        x.push(i);
      }
    }
    return x.isEmpty();
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str = s.next();
    String res = (isValid(str)) ? "True": "False";
    System.out.print(res);
  }
}