import java.util.*;
public class trycatchtest
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of x integer");
        int x = sc.nextInt();
        System.out.println("Enter the value of y integer");
        int y = sc.nextInt();
        System.out.println("Enter the value of String s1");
        String s1 = sc.next();
        System.out.println("Enter the value of String s2");
        sc.nextLine();
        String s2 = sc.nextLine();//why there is error in this ????
        int z;
        try
        {
            z=x/y;
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("Cant divide x by zero");
        }
        finally
        {
        System.out.println("The value of integer x is "+x);
        System.out.println("The value of integer y is "+y);
        System.out.println("The value of String s1 is "+s1);
        System.out.println("The value of String s2 is "+s2);
        }
    }
}