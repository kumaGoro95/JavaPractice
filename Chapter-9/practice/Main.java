import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    String file1 = args[0];
    String file2 = args[1];
    FileInputStream fis = null;
    GZIPOutputStream gzos = null;
    try{
      fis = new FileInputStream(file1);
      FileOutputStream fos = new FileOutputStream(file2);
      BufferedOutputStream bos = new BufferedOutputStream(fos);
      gzos = new GZIPOutputStream(bos);
      int i = fis.read();
      while(i != -1){
        gzos.write(i);
        i = fis.read();
      }
      gzos.flush();
      gzos.close();
      fis.close();
    }catch(IOException e){
      System.out.println("ファイル操作エラー");
      try{
        if (fis != null){
          fis.close();
        }
        if(gzos != null){
          gzos.close();
        }
      }catch(IOException e2){ }
    }
  }
}
