import java.io.*;
public class Newton_nth_root
{
    public static double nthroot(double variable,int root,double aroot)
    {
        double temp =  aroot - (Math.pow(aroot, root) - variable) / (root * Math.pow(aroot, root - 1));
        if( Math.abs(temp-aroot) >0.01)//temp oscillates between real and true value
        return nthroot(variable,root,temp);
        else 
        return temp;
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(isr);
        System.out.println("Enter the value whose root is to be calculated ");
        double variable = Integer.parseInt(bfr.readLine());
        System.out.println("Enter the root value ");
        int root = Integer.parseInt(bfr.readLine());
        double aroot = 1;
        System.out.println("The answer is : "+nthroot(variable,root,aroot));
    }
}