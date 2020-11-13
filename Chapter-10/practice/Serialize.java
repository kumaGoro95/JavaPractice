import java.io.*;

public class Serialize{
  public static void main(String[] args) throws Exception{
    Employee tanaka = new Employee();
    takana.name = "田中太郎";
    tanaka.age = 41;
    Department soumu = new Department();
    soumu.name = "総務部";
    soumu.leader = tanaka;

    //①インスタンスの直列化と保存
    FileOutputStream fos = new FileOutputStream("c:¥¥company.dat");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(soumu);
    oos.flush();
    oos.close();
  }
}
