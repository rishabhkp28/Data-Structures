import java.util.*;
public class nCr
{
    public static int nCr(int n ,int r)
    {
        int res=1;
        if(r>n/2)
        r=n-r;
        for(int i = 0;i<=r;i++)
        {
            res*=(n-(i-1));
            res/=i+1;
        }
        return res;//res helps us to evaluate nC0
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");

        int n = sc.nextInt();
        System.out.println("Enter the value of r :");

        int r = sc.nextInt();
        System.out.println("The answer is "+nCr(n,r));


    }
}