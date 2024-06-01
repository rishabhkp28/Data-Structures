import java.util.HashMap;
import java.util.List;
import java.util.HashSet;
import java.util.Collections;
import java.util.ArrayList;
public class threesome
{
    public static List<List<Integer>> threeSum(int[] nums) 
    {
        HashMap<Integer,Integer> hashmap = new HashMap<Integer ,Integer>(); 
        HashSet<List<Integer>>hashset = new HashSet<>();
        for(int i = 0;i<=nums.length -1;++i)
        {
            if(hashmap.containsKey(nums[i]))
            {
                hashmap.put(nums[i],1+hashmap.get(nums[i]));
            }
            else
            hashmap.put(nums[i],1);
        }
        for(int i = 0 ;i<=nums.length-1;i++)
        {
            hashmap.put(nums[i],hashmap.get(nums[i])-1);
            for(int j = i+1;j<=nums.length -1 ; ++j)
            {
                     List <Integer> list1 = new ArrayList<Integer>();

                    hashmap.put(nums[j],hashmap.get(nums[j])-1);
                    if(hashmap.containsKey(-1*(nums[i]+nums[j])))
                    {
                        if(hashmap.get(-1*(nums[i]+nums[j]))>0)
                        {
                            list1.add(nums[i]);list1.add(nums[j]);
                            list1.add(-1*(nums[i]+nums[j]));
                            Collections.sort(list1);
                            hashset.add(list1);
                        }
                    }
                    hashmap.put(nums[j],1+hashmap.get(nums[j]));
                    
                }
         hashmap.put(nums[i],1+hashmap.get(nums[i]));
            
        }
        return new ArrayList(hashset);
    }
        public static void main(String args[])
        {
            List<List<Integer>> list= new ArrayList<>();
            list = threeSum(new int[]{-1,0,1,2,-1,-4});
            System.out.println(list);

        }
    }
