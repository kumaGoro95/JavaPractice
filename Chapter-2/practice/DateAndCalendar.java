import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class DateAndCalendar{
  public static void main(String[] args){
    Date now = new Date();
    Calendar c = Calendar.getInstance();
    c.setTime(now);
    int day = c.get(Calendar.DAY_OF_MONTH);
    c.set(Calendar.DAY_OF_MONTH, day+100);
    Date future = c.getTime();
    SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
    String str = f.format(future);
    System.out.println(str);
  }
}
