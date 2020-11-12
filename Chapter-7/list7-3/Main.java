import java.util.*;
import java.lang.Runtime;

public class Main{
  public static void main(String[] args){
    System.out.println("Javaのバージョン");
    System.out.println(System.getProperty("java.version"));
    Properties p = System.getProperties();
    Iterator<String> i = p.stringPropertyNames().iterator();
    System.out.println("【システムプロパティ一覧】");
    while(i.hasNext()){
      String key = i.next();
      System.out.print(key + " = ");
      System.out.println(System.getProperty(key));
    }
    long f = Runtime.getRuntime().freeMemory() /1024/1024;
    long g = Runtime.getRuntime().totalMemory() /1024/1024;
    long h = Runtime.getRuntime().maxMemory() /1024/1024;
    System.out.println(f);
    System.out.println(g);
    System.out.println(h);    
  }
}
