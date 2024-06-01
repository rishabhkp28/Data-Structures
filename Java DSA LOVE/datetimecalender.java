import java.util.Calendar;
import java.util.Date;
public class datetimecalender
{
    public static void main(String args[])
    {
        Calendar calendar = Calendar.getInstance();
        System.out.println("This is to demonstrate the use of calender class");
        System.out.println("==================================================================================");
        int day =calendar.getMinimum(Calendar.DAY_OF_WEEK);
        System.out.println(day);
        System.out.println(calendar.getMinimum(Calendar.DATE));
        System.out.println(calendar.getMinimum(Calendar.MONTH));
        System.out.println(calendar.getMinimum(Calendar.YEAR));
        System.out.println(calendar.getMinimum(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.getMinimum(Calendar.HOUR));
        System.out.println(calendar.getMinimum(Calendar.MINUTE));
        System.out.println(calendar.getMinimum(Calendar.SECOND));
        System.out.println("==================================================================================");
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.getTime());
        System.out.println(calendar.getMinimum(Calendar.MONTH));
        System.out.println(calendar.getMaximum(Calendar.MONTH));
        System.out.println("The year is : "+calendar.get(Calendar.YEAR));
        System.out.println("The month is : "+calendar.get(Calendar.MONTH));
        calendar.set(Calendar.MONTH,19);
        System.out.println("After updation");
        System.out.println("The month is : "+calendar.get(Calendar.MONTH));
        System.out.println("The year is : "+calendar.get(Calendar.YEAR));
        System.out.println(calendar.getMaximum(Calendar.MONTH));
        Date date = new Date();
        System.out.println("This is to demonstrate the use of date class");
        System.out.println("This is the current date");
        System.out.println(date);
        System.out.println(date.getTime());
        
        
    }
}