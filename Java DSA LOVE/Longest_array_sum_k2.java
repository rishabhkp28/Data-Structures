import java.util.*;
public class Longest_array_sum_k2
{
    public static void main(String args[])
    {
        int arr[] = new int[]{-13,0,6,15,16,2,15,-12,17,-16,0,-3,19,-3,2,-9,-6};
        int k=15;
        int length=0;
        int sum=0;
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        for(int i = 0 ; i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum==k)
            {
                length = Math.max(i+1,length) ;
                if(!hashmap.containsKey(sum))
                hashmap.put(sum,i);
            }
            if(hashmap.containsKey(sum-k))
            {
                
                length = Math.max(i- hashmap.get(sum-k),length);
                if(!hashmap.containsKey(sum))
                hashmap.put(sum,i);
            }
            else
            {
                if(!hashmap.containsKey(sum))
                hashmap.put(sum,i);
            }

        }

        System.out.println(length);

    }
    
}