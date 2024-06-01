import java.io.*;
import java.util.*;
public class primefactorsnovice
{
    public ArrayList<Integer> primefactors(int n)
    {
        ArrayList <Integer> pm = new ArrayList<Integer>();
        int i = 2;
        while(i <= n)
        {
            if(n%i==0)
            {
                pm.add(i);
                n=n/i;
            }
            else
            ++i;
        }
        return pm;
    }

    public static void main(String args[])throws IOException
    {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of n");
        int n = Integer.parseInt(bfr.readLine());
        primefactorsnovice obj = new primefactorsnovice();
        ArrayList <Integer> pn = new ArrayList<Integer>();
        pn= obj.primefactors(n);
        System.out.println(pn);
    }
}