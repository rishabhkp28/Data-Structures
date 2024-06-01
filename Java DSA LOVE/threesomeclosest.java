import java.util.Arrays;
class threesomeclosest {
    public static int threeSumClosest(int[] nums, int target) 
    {
        Arrays.sort(nums);
        int sum = nums[0]+nums[1]+nums[nums.length-1];
        int diff =Math.abs(nums[0]+nums[1]+nums[nums.length-1]-target);
        int finalsum= nums[0]+nums[1]+nums[nums.length-1];
    for(int  i = 0 ; i<= nums.length -3;i++)
    {
        int ptr1 = i+1;
        int ptr2 = nums.length -1;
        while(ptr1<ptr2)
        {
            sum= nums[ptr1]+nums[ptr2]+nums[i];   
            if(Math.abs(sum-target)<diff)
            {
                diff = Math.abs(sum-target);
                finalsum = sum;
            }
            if(sum<target)
                ++ptr1;
            else if(sum>target)
                --ptr2;
            else if(sum==target)
                break;
        }
    }
    
    return finalsum;
}
    
    public static void main(String args[])
    {
       int sum = threeSumClosest(new int[]{4,0,5,-5,3,3,0,-4,-5},-2);
       System.out.println(sum);
    }
}
            