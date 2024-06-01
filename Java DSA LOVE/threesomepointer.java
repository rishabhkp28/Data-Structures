import java.util.*;
public class threesomepointer{
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List <List<Integer>> list = new ArrayList<>();
        int ptr2 = nums.length-1;
        int sum = 0;int i=0;
        while(i<=nums.length-3) 
        {
            sum = 0; ptr2=nums.length-1;
            int ptr1 = i+1;
            while(ptr1<ptr2)
            {
                sum = nums[ptr1]+nums[ptr2];
                if(sum > -1*nums[i])
                {
                    while(nums[ptr2--]==nums[ptr2]&&ptr1<ptr2)
                    continue;
                }
                else if(sum < -1*nums[i])
                {
                    while(nums[ptr1++]==nums[ptr1]&&ptr1<ptr2)
                    continue;
                }
                else
                {
                    list.add(Arrays.asList(nums[ptr1],nums[ptr2],nums[i]));
                    while(nums[ptr1++]==nums[ptr1]&&ptr1<ptr2)
                    continue;
                    while(nums[ptr2--]==nums[ptr2]&&ptr1<ptr2)
                    continue;
                }
            }
            while(nums[i++]==nums[i]&&i<=nums.length-3)
            continue;
        }
     return list;
    }
    public static void main(String args[])
        {
            List<List<Integer>> list= new ArrayList<>();
            list = threeSum(new int[]{0,0,0,0});
            System.out.println(list);

        }

}
