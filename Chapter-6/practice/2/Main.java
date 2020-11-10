public class Main{
  public static void main(String[] args){
    FuncList funcList = new FuncList();
    Func1 func1 = x -> x % 2 == 1;
    Func2 func2 = (male, name) -> {
      if (male == true){ return "Mr." + name; }
      else { return "Ms." + name; } };
    System.out.println(func1.call(5));
    System.out.println(func2.call(true, "おちゃくん"));
  }
}
