public class AppendMethod{
  public static void main(String[] args){
    StringBuilder sb = new StringBuilder();
    for(int i = 1; i <= 99; i++){
      sb.append(i);
      sb.append(",");
    }
    sb.append(100);
    String s = sb.toString();
    System.out.println(s);
  }
}
