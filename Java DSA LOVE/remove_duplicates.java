public class remove_duplicates
{
    public static void main(String args[])
    {
        int[] nums= new int[]{1,1,2};
        int ptr1 = 1;
        int ptr2;
        for(ptr2 = 1;ptr2<nums.length;++ptr2)
        {
            if(nums[ptr2]!=nums[ptr2-1])
            nums[ptr1++]=nums[ptr2];
            else
            continue;
        }
        for(int i : nums)
        {
            System.out.println(i);

        }
    }
}