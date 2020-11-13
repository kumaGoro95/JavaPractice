import java.util.*;
import java.io.*;

public class LoadProperty{
  public static void main(String[] args){
    Reader fr = new FileReader("c:¥¥pref.properties");
    Properties p = new Properties();
    p.load(fr);
    String aichiCapital = p.getProperty("aichi.capital");
    String aichiFood = p.getProperty("aichi.food");
    System.out.print(aichiCapital+":");
    System.out.print(aichiFood);
    fr.close(fr);
  }
}
