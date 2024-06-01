import java.io.*;
public class recursion
{
    public static int rec(int x)
    {
        if(x==1)
        return 1;
        else 
        return x*rec(x-1);
    }
    public static void main(String[] args)throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(isr);
        System.out.println("Enter the value: ");
        int x = Integer.parseInt(bfr.readLine());
        
        System.out.println("The factorial is : "+rec(x));
    }
}