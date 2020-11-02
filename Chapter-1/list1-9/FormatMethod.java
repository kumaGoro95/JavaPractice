public class FormatMethod{
  public static void main(String[] args){
    final String FORMAT = "%8s %3s歳 所持金%,5d";
    String s = String.format(FORMAT, "yu-chan", "34", 1098);
    String t = String.format(FORMAT, "yanyan", "8", 113);
    System.out.println(s);
    System.out.println(t);
  }
}
