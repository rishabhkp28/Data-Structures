public class problem5
{
    public static void main(String args[])
    {
        int[] nums = new int[]{2,0,2,1,1,0};
        int ptr1=0;
        int ptr2=nums.length-1;//i must receive correct element everytime;
        for(int i =0;i<=ptr2;)
        {
            if((nums[i]==0&&i<ptr1)||(nums[i]==1&&i>=ptr1))
            i++;
            else if(nums[i]==0)
            {
                int temp = nums[i];
                nums[i]=nums[ptr1];
                nums[ptr1]=temp;
                ++ptr1;
            }
            else if(nums[i]==1)
            {
                int temp = nums[i];
                nums[i]=nums[ptr1];
                nums[ptr1]=temp;
            }
            else if(nums[i]==2)
            {
                int temp = nums[i];
                nums[i]=nums[ptr2];
                nums[ptr2]=temp;
                --ptr2;
            }   
        }
        for(int i = 0;i<=nums.length-1;i++)
        System.out.println(nums[i]);
    }
}