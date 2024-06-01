import java.util.*;
class leetcode1 {
    public static int[] twoSum(int[] nums, int target) {
        int sum=0;
        for(int i =0;i<nums.length;i++)
        {
            for(int j = 0;j<nums.length;j++)
            {
                if(j==i)
                continue;
                else if(nums[i]+nums[j]==target)
                return new int[]{i,j};
                else
                continue;
            }

        }
        return new int[]{0};
    }
public static void main(String args[])
{
    String s = Arrays.toString(twoSum(new int[]{-1,-2,-3,-4,-5},-8));
    System.out.println(s);
}
}