import java.util.*;
public class array_sum_k
{
    public static void main(String args[])
    {
            int[] arr= new int[]{1,2,3};
            int k =3;
                int sum=0;
                HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
                int count=0;
                int presum = 0 ;
                for(int i = 0 ; i<arr.length;i++)
                {
                    presum += arr[i];
                    if(presum==k)//whole this code can be erased if we just add 0 initially to hashmap
                    {
                        if(hashmap.containsKey(0))
                        count+=hashmap.get(0)+1;
                        else
                        count+=1;

                        if(hashmap.containsKey(presum))
                        hashmap.put(presum,hashmap.get(presum)+1);
                        else
                        hashmap.put(presum,1);
                    }
                    else if(hashmap.containsKey(presum-k))
                    {
                        count += hashmap.get(presum-k);
                        if(hashmap.containsKey(presum))
                        hashmap.put(presum,hashmap.get(presum)+1);
                        else
                        hashmap.put(presum,1);
                    }
                    else
                   { 
                       if(hashmap.containsKey(presum))//we need to check everytime before adding presum
                        hashmap.put(presum,hashmap.get(presum)+1);
                        else
                        hashmap.put(presum,1);
                    }
                }
                System.out.println(count);
            }
        }
    
