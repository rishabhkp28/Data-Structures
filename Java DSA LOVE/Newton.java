import java.util.Scanner;
public class Newton
{
    public double sqrt(double n,double x)
    {
        double aroot = 0.5*(x + n/x);
        if(Math.abs(aroot-x)>0.01)
            return sqrt(n,aroot);
        else
            return aroot;
    }

    public static void main(String args[])
    {
        Newton rhapson = new Newton();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for finding its root"); 
        int n =scanner.nextInt();
        System.out.printf("The square root of a number upto 2 significant digits is %.2f",rhapson.sqrt(n,1));
       
    }
}