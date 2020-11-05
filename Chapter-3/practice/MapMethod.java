import java.util.*;

class Dog{
  private String name;
  public Dog(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
}

public class MapMethod{
  public static void main(String[] args){
    Dog d1 = new Dog("おちゃくん");
    Dog d2 = new Dog("やんやん");
    Map<Dog, Integer> dogs = new HashMap<Dog, Integer>();
    dogs.put(d1,10);
    dogs.put(d2,3);

    for(Dog key : dogs.keySet()){
      int value = dogs.get(key);
      System.out.println(key.getName() + "は" +value+ "歳");
    }
  }
}
