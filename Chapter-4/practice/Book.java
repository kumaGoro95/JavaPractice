import java.util.*;

public class Book{
  private String title;
  private Date publishDate;
  private String comment;

  public boolean equals(Object o){
    if(o == this) return true;
    if(o == null) return false;
    if(!(o instanceof Book)) return false;
    Book b = (Book) o;
    if(!publishDate.equals(b.publishDate)){
      return false;
    }
    if(!title.equals(b.title)){
      return false;
    }
    return true;
  }

  public int hashCode(){
    int result = 1;
    result = result * 31 + name.hashCode();
    result = result * 31 + publishDate;
    return result;
  }


  public int compareTo(Book obj){
    if(this.publishDate < obj.publishDate){
      return -1;
    }
    if(this.publishDate > obj.publishDate){
      return 1;
    }
    return 0;
  }

  public Book clone(){
    Book result = new Book();
    result.title = this.title;
    result.publishDate = this.publishDate;
    result.comment = this.comment;
    return result;
  }
}
