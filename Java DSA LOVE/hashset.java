import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class hashset
{
    public static void main(String args[])
    {
       HashSet<Integer> hashset = new HashSet<Integer>();
       hashset.add(15);
       hashset.add(87);
       hashset.add(90);
       hashset.add(012);
       hashset.add(878);
       hashset.add(87);//dont get addded here
       System.out.println(hashset);
       Iterator it = hashset.iterator();
       HashMap <String , Integer > hashmap = new HashMap<>();
       hashmap.put("Rishabh",100);
       hashmap.put("Naruto",90);
       hashmap.put("Hinata",78);
       hashmap.put("Konohamaru",78);
       hashmap.put("kakashi",85);
       System.out.println(hashmap);
       
       while(it.hasNext())
       {
           System.out.println(it.next());
        }
        System.out.println("------------------------------------------------------");
        System.out.println(hashmap.entrySet());
        System.out.println(hashmap.keySet());
        System.out.println(hashmap.values());
        System.out.println("------------------------------------------------------");

        Iterator it1 = hashmap.entrySet().iterator();
        while(it1.hasNext())
        {
           System.out.println(it1.next());
        }
        System.out.println("------------------------------------------------------");
        Iterator it2 = hashmap.entrySet().iterator();

        while(it2.hasNext())
        {
            Map.Entry keyvalue= (Map.Entry)it2.next();
            String key = (String)keyvalue.getKey();//it must be done explicitly
            int value = (int)keyvalue.getValue();//it must be done explicitly
            System.out.println("The key is "+key+" the value is "+value);
        }
        System.out.println("------------------------------------------------------");

        for(Map.Entry keyvalue : hashmap.entrySet())
        {
            String key = (String)keyvalue.getKey();
            int value = (int)keyvalue.getValue();
            System.out.println("The key is "+key+" the value is "+value);
        }
        System.out.println("------------------------------------------------------");

        for(Map.Entry <String, Integer> keyvalue : hashmap.entrySet())
        {
            String key = keyvalue.getKey();
            int value = keyvalue.getValue();
            System.out.println("The key is "+key+" the value is "+value);
        }
        System.out.println("------------------------------------------------------");
        hashmap.forEach((k,v)->System.out.println("The key is "+k+" the value is "+v));

    }
}