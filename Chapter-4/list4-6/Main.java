import java.util.*;

public class Main{
  public static void main(String[] args){
    List<Account> list = new ArrayList<Account>();
    Account a1 = new Account(4);
    Account a2 = new Account(2);
    Account a3 = new Account(12);
    list.add(a1);
    list.add(a2);
    list.add(a3);

    Collections.sort(list);
    System.out.println(list);
  }
}
