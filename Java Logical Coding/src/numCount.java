import java.util.*;
public class numCount {
  static int count(int x){
    int c = 0;
    if(x < 0)
      return -1;
    while(x != 0){
      x = x/10;
      c++;
    }
    return c;
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    s.close();
    int res = count(n);
    if(res != -1)
      System.out.println(res);
    else
      System.out.print("Invalid");
  }
}