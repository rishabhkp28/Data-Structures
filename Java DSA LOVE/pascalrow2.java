import java.util.*;
public class pascalrow2
{
    public static void nCr(int n)
    {
        int res =1;
        System.out.println("The value of "+0+" element is "+res);
        int r ;
        for(r = 1;r<=n;r++)
        {
            res*=(n-(r-1));
            res/=r;
            System.out.println("The value of "+(r)+" element is "+res);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row :");

        int n = sc.nextInt();
        nCr(n-1);
    }
}