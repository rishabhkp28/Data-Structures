public class missingnumber
{
    public static void main(String args[])
    {
        int[] nums = new int[]{3,0,1};
        for(int i = 0 ;i<nums.length;)
        {
            if(nums[i]==nums.length||nums[i]==i)
            ++i;
            else 
            {
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
            }

        }
        int i =0;
        for(;i<nums.length;++i)
        {
            if(nums[i]!=i)
            {
                break;
                
            }
        }
        System.out.println(i);//i is either teh number which is n or missing index

    }
}