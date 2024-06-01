import java.util.*;
public class numsumrec
{
    static int sum = 0;
    public void numsum(int n)
    {
        if(n==0)
        return ;
        else
        {
            sum+= n%10;
            numsum(n/10);
        }
    }
    public int numsum2(int n)
    {
        if(n==0)
        return 0;
        else
        {
            return (n%10 + numsum2(n/10));
        }
    }
    public static void main(String args[])
    {
        numsumrec obj = new numsumrec();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number the sum of whose digits is to be found : ");
        int n = sc.nextInt();
        obj.numsum(n);
        System.out.println(sum);
        System.out.println(n);
        System.out.println(obj.numsum2(n));
    }
}
