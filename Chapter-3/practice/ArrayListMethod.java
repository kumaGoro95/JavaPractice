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

public class ArrayListMethod{
  public static void main(String[] args){
    Dog d1 = new Dog("おちゃくん");
    Dog d2 = new Dog("やんやん");
    List<Dog> dogs = new ArrayList<Dog>();
    dogs.add(d1);
    dogs.add(d2);

    for(Dog d : dogs){
      System.out.println(d.getName());
    }
  }
}
