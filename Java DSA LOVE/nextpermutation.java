import java.util.*;
 class nextpermutation
{
    public static void main(String[] args)
    {
        int nums[] = new int[]{1,3,2};
        int flag = 0;
        int i;
        for(i = nums.length-2 ;i>=0;--i)
        {
            if(nums[i]<nums[i+1])
            {
                flag =1;
                for(int j = nums.length-1 ;j>=i+1;--j)
                {
                    if(nums[i]<nums[j])
                    {
                        int temp = nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                        break;
                    }

                }
                break;
            }
            else
            continue;
        
        }
        if(flag==0)
        Arrays.sort(nums);
        else
        Arrays.sort(nums,i+1,nums.length);
        for (i = 0;i<=nums.length-1;i++)
        System.out.print(nums[i]+",");
    }
}