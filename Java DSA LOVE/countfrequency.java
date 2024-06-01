import java.util.HashMap ;
public class countfrequency
{
    public static void main(String args[])
    {
        int arr[] = new int[]{1,45,4,2,1,3,6,6,2,42,53,52,4,556,8,4};
        HashMap <Integer,Integer> hashmap = new HashMap<>();
        int i = 0;
        while(i<arr.length)
        {
            if(hashmap.containsKey(arr[i]))
            {
                hashmap.put(arr[i],hashmap.get(arr[i])+1);
            }
            else
            hashmap.put(arr[i],1);
            ++i;
        }
        System.out.println(hashmap);
    }
}