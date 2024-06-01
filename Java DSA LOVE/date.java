import java.util.*;
public class date  //java.lang package is by default invoked 
{
    int date;
    int month;
    int year;
    public date(int date ,int month,int year)
    {
        this.date = date+1;
        this.month = month+1;
        this.year = year+10;
    }
    public void display()
    { 
        System.out.println("The date is -");
        System.out.println("Date : "+this.date);
        System.out.println("Month : "+this.month);
        System.out.println("Year : "+this.year);
        System.out.println("The date is -");
        System.out.println("Date : "+date);
        System.out.println("Month : "+month);
        System.out.println("Year : "+year);
        System.out.println(this);
        System.out.println("------------------------------------------------------------------");
    }
    public static void main(String []args)//its always necessary to give something to the main
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the date");
        int date =Integer.parseInt(sc.next());//parseint is a method in java.lang's Integer class
        /*converts the string to integer */
        System.out.println("date main is "+date);
        date dateobj=new date(19,12,21);
        dateobj.display(); 
        System.out.println(dateobj);
        new date(1,2,3).display();
       //error  date object;
        //error object.display();
    }
}