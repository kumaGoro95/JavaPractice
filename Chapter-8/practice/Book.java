import java.util.*;
import org.apache.commons.lang3.builder.*;

public class Book{
  private String title;
  private Date publishDate;
  private String comment;

  public boolean equals(Object o){
    return EqualsBuilder.reflectionEquals(this, o);
  }
  //ハッシュ値を生成
  public int hashCode(){
    return HashCodeBuilder.reflectionHashCode(this);
  }

  public int compareTo(Book obj){
    return CompareToBuilder.reflectionEquals(this, o);
  }

  public Book clone(){
    Book result = new Book();
    result.title = this.title;
    result.publishDate = this.publishDate;
    result.comment = this.comment;
    return result;
  }




}
