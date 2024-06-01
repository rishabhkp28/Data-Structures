import java.util.HashMap;
public class twoSum 
{
    public static int[] twoSum(int[] nums, int target) 
    {
        int sum = 0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int[] arr = new int[2];
        for(int i = 0;i<=nums.length-1 ; ++i)
        {
            if(hm.containsKey(target-nums[i]))
            {
                arr[0] = i;
                arr[1]=hm.get(target - nums[i]);
            }
            else
            hm.put(nums[i],i);
        }
        return arr;
    }
    public static void main(String args[])
    {
        int[] arr = twoSum(new int[]{3,2,4},6);
        System.out.println(arr[0]+" "+arr[1]);
    }
}