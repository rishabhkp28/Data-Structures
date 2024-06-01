import java.util.HashMap;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Map;
public class sort_characters_by_frequency
{
    public static String frequencySort(String s)
        {
            HashMap <Character, Integer> hashmap = new HashMap<>();//unordered map
            for(int i =0;i<=s.length()-1;i++)//put into hashmap the frequency;
            hashmap.put(s.charAt(i),hashmap.getOrDefault(s.charAt(i),0)+1);
            //comparator to be passed into ordered map(TreeMap in java)
            Comparator <Character> cmp = new Comparator<Character>()
            {
                @Override
                public int compare(Character c1, Character c2) {
                    if(hashmap.get(c1)>hashmap.get(c2))
                    return -1;
                    else if(hashmap.get(c1)<hashmap.get(c2))
                    return 1;
                    else
                    { 
                        if(c1.charValue()<= c2.charValue())
                        return -1;//dont require swapping 
                        else
                        return 1;//if c1 has greater ascii value place it after;
                    }             
                }
            };
            
            TreeMap<Character,Integer> map = new TreeMap<>(cmp);
            map.putAll(hashmap);
            //now the char with max freq will be at lesser index in ordered Map
            s = "";
            System.out.println(map.keySet());
            for (Map.Entry <Character, Integer> entry : map.entrySet()) {
                    String c = Character.toString(entry.getKey());
                    int freq = entry.getValue();
                for (int i = 0; i < freq; i++) {
                    s = s + c;
                }
            }
            
            return s;
            }//now we are just forming the answer out of freq and character;


    

    public static void main(String args[])
    {
       System.out.println( frequencySort("abbabbabkhgd"));
    }
}
