import java.io.*;
public class patternrecursion
{
    public static void pattern(int r , int c)
    {
        if(r==0)
        return;
        else if(c==0)
        {
            System.out.println("");
            pattern(r-1,r-1);
        }
        else
        {
            System.out.print("*");
            pattern(r,c-1);
        }

    }

    public static void main(String args[])throws IOException
    {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the total rows or colums");
        int n = Integer.parseInt(bfr.readLine());
        pattern(n,n);
    }
}