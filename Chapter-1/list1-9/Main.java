public class Main{
  public static void main(String[] args){
    final String FORMAT = "%8s %6s 所持金%,5d";
    String s = String.format(FORMAT, "yu-chan", "ossan", 1098);
    String t = String.format(FORMAT, "yanyan", "wanwan", 113);
    System.out.println(s);
    System.out.println(t);
  }
}
