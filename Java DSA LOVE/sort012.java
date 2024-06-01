public class sort012
{
    public static void main(String args[])
    {
        int[] nums = new int[]{2,0,2,1,1,0};
                int ptr1 = 0 ;
                int ptr2 = nums.length-1;
                int temp=0;
                for(int i = 0 ;i<=ptr2;)
                {
                    if(nums[i]==0)
                    {
                        temp=nums[ptr1];
                        nums[ptr1] = nums[i];
                        nums[i] = temp;
                        ++ptr1;
                    }
                    else if(nums[i]==2)
                    {
                        temp=nums[ptr2];
                        nums[ptr2] = nums[i];
                        nums[i]= temp;
                        --ptr2;
                    }
                   
                        if((nums[i]==0 && i <ptr1)||nums[i]==1)
                        ++i;
                    
                }
    
    for(int i : nums)
    {
        System.out.println(i);
    }
}
        
}
        