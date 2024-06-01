import java.util.*;
public class SOE2
{
    public int[] primetable(int n)
    {
        int pt[] = new int[n+1];
        
        for(int i =0; i<= n ;++i)
        {
            pt[i]= i;
        }
        for(int i = 2 ;i<=n;i++)
        {
            if(i==pt[i])
            {
                for(int j =i*i;j<=n;j+=i)
                {
                    pt[j]= i;
                }
            }
        }
        return pt;
    }
    public void primefactors(int n,int[] pt)
    {
        ArrayList <Integer> pfs = new ArrayList<Integer>();
        System.out.println("The prime factors of "+n+" are : ");
        while(n!=1)
        {
            pfs.add(pt[n]);
            n=n/pt[n];
        }
        System.out.println(pfs);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its prime factors : ");
        int n = sc.nextInt();
        SOE2 obj = new SOE2();
        int pt[] =new int[n+1];
        pt = obj.primetable(n);
        for(int i = 0;i<=n;i++)
        {
            System.out.printf("The smallest prime factor of %d is %d \n",i,pt[i]);
        }
        obj.primefactors(n,pt);
    }
}