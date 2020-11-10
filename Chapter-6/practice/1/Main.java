public class Main{
  public static void main(String[] args){
    FuncList funcList = new FuncList();
    Func1 func1 = FuncList::isOdd;
    Func2 func2 = funcList::addNamePrefix;
    System.out.println(func1.call(5));
    System.out.println(func2.call(true, "おちゃくん"));
  }
}
