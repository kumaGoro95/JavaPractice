public class Account implements Comparable<Account>{
  int number;

  Account(int number){
    this.number = number;
  }

  public String toString(){
    return "口座番号:" + this.number;
  }

  public int compareTo(Account obj){
    if(this.number < obj.number){
      return -1;
    }
    if(this.number > obj.number){
      return 1;
    }
    return 0;
  }
}
