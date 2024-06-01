import java.util.*;
public class xor_k 
{
    public static void main(String args[])
    {
        int k = 6;
        int prexor=0;
        int count=0;
        Integer arr1[] = new Integer[]{ 4, 2, 2, 6, 4};
        ArrayList <Integer> arr = new ArrayList<>(Arrays.asList(arr1));
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        hashmap.put(0,1);
        for(int i = 0 ; i<arr.size() ; i++)
        {
            prexor ^= arr.get(i);
            if(hashmap.containsKey(prexor^k))
            {
                
                count += hashmap.get(prexor^k);
                if(hashmap.containsKey(prexor))
                hashmap.put(prexor,hashmap.get(prexor)+1);
                else
                hashmap.put(prexor,1);
            }
            else
            {
                if(hashmap.containsKey(prexor))
                hashmap.put(prexor,hashmap.get(prexor)+1);
                else
                hashmap.put(prexor,1);
            }

        }

     System.out.println(count);

    }
}


        