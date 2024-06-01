import java.util.*;
public class SOE1
{
    public  boolean[] SOE(int n)
    {
        boolean arr[] = new boolean[n-1];
        for(int i = 2;i<=n;i++)
        {
            if(!arr[i-2])
            {
                for(int j = i*i-2;j<=n-2;j+=i)
                arr[j]=true;
            }
        }
        return arr;
        
    }
    public static void main(String args[])
    {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number till which prime numbers has to be found");
        int n = sc.nextInt();
        SOE1 obj = new SOE1();
        boolean arr[] = obj.SOE(n);
        for(int i = 0;i<=n-2;i++)
        {
            
            if(!arr[i])
            System.out.println(i+2);   
        }
    }
}