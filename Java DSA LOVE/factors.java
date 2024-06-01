import java.util.*;
public class factors
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factors in sorted form");
        int n = sc.nextInt();
        ArrayList <Integer> list= new ArrayList<Integer>();
        int s =0;
        for(int i = 1;i<= Math.sqrt(n);i++)
        {
           
            if(n%i==0)
            {
                list.add(s,n/i);
                if(n/i!=i)
                {
                    int l = list.size();
                    list.add(l-s,i);
                    ++s;
                }
                else
                continue;
            }
        }
        System.out.println(list);
    }
}