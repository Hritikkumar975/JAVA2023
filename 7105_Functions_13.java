import java.lang.*;
class H {
  public static void main(String[] args) {
    String x = "hello";
    System.out.print(test(x));
  }
  public static boolean test(String x) {
    String str = "aeiou";
    String y = x.toLowerCase();
    for (int i = 0; i < y.length(); i++) {
      if (str.indexOf(y.charAt(i)) == -1)
        return false;
    }
    return true;
  }
}
