import java.io.*;
public class binaryexponentiation
{
    public double myPow(double a, int n) 
        {
        int flag = 0;
        if(n==Integer.MIN_VALUE)
        {
            flag = 2;
            n=n+1;
            n = n*(-1);
        }
        else if( n<0 )
        {
            flag = 1;
            n = n*(-1);
        }
        double ans = 1;
        double ab=a;
        while(n!=0)
        {
            if(n%2==0)
            {
                n=n/2; 
                ab = ab*ab;
            }
            else
            {
                n=n-1;
                ans*=ab;
            }
        }
        if (flag ==0)
        return ans;
        else if(flag ==1) 
        return 1/ans;
        else
        return (1/ans)/a;
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr  = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(isr);
        System.out.print("Enter the number : ");
        double a = Double.parseDouble(bfr.readLine());
        System.out.print("Enter the exponent : ");
        int n = Integer.parseInt(bfr.readLine());
        binaryexponentiation obj = new binaryexponentiation();
        double answer = obj.myPow(a,n) ;
        System.out.println(answer);
    }   
}
    