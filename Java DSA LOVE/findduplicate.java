public class findduplicate
{
    public static void main(String args[])
    {
        int [] nums = new int[]{1,3,4,2,2};
        int temp=0;
        for(int i = 0 ; i<=nums.length-1;)
        {
            if(nums[i]==nums[nums[i]-1])
            ++i;
            else if(nums[i]==i+1)
            ++i;
            else
            {   
                temp = nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i] = temp;

            }
        }
    }
}