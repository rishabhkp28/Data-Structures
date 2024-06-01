import java.io.*;
public class revnumrec
{
    static int rev =0;
    static int length;
    public  void revnum(int n)
    {
        if(n==0)
        {
            return ;
        }
        else
        {
            rev = rev*10 + n%10;
            revnum(n/10);
        }
    }
    public  int revnum2(int n)
    {
        if(n==0)
        return 0;
        else
        {
            int placevalue= (int)Math.pow(10,String.valueOf(n).length()-1);
            return( placevalue*(n%10) + revnum2(n/10));
        }
    }

    public static void main(String args[])throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(isr);
        System.out.print("Enter the number : ");
        int n =Integer.parseInt(bfr.readLine());
        revnumrec obj = new revnumrec();
        obj.revnum(n);
        System.out.println("Reversed number is "+rev);
        length = Integer.toString(n).length();
        int reversed = obj.revnum2(n);
        System.out.println("Reversed number is "+reversed);

    }
}