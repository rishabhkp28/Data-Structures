import java.util.*;
public class fourSum
{
    public static List<List<Integer>> fourSum(int[] nums,int target1) 
    {
        Arrays.sort(nums);
        long target= target1;//so that it doesnt lead to integer underflow
        List <List<Integer>> list = new ArrayList<>();
        int ptr2 = nums.length-1;
        int sum = 0;int i=0;
        while(i<=nums.length-4) 
        {
            int j = i+1;
            while(j<=nums.length-3)
            {
                int ptr1 = j+1; sum = 0; ptr2=nums.length-1;
                while(ptr1<ptr2)
                {
                    sum = nums[ptr1]+nums[ptr2];
                    if(sum > (target -nums[i]-nums[j]))//here is the reason of underflow
                    {
                        while(nums[ptr2--]==nums[ptr2]&&ptr1<ptr2)
                        continue;
                    }
                    else if(sum < (target -nums[i]-nums[j]))
                    {
                        while(nums[ptr1++]==nums[ptr1]&&ptr1<ptr2)
                        continue;
                    }
                    else
                    {
                        list.add(Arrays.asList(nums[i],nums[j],nums[ptr1],nums[ptr2]));
                        while(nums[ptr1++]==nums[ptr1]&&ptr1<ptr2)
                        continue;
                        while(nums[ptr2--]==nums[ptr2]&&ptr1<ptr2)
                        continue;
                    }
                }
                while(nums[j++]==nums[j]&&j<=nums.length-3)
                continue;
            }
            while(nums[i++]==nums[i]&&i<=nums.length-4)
            continue;
        }
     return list;
    }
    public static void main(String args[])
        {
            List<List<Integer>> list= new ArrayList<>();
            list = fourSum(new int[]{1000000000,1000000000,1000000000,1000000000},-294967296);
            System.out.println(list);

        }
}
