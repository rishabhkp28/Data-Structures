public class Longest_array_sum_k
{
    // logic works only on positive numbers
    
    public static void main(String args[])
    {
        int[] nums= new int[]{3,9,1,3,7,15,8,1,12,1};
        int k = 15;
        int ptr1=0;
        int ptr2=0;
        int n =0;
        int sum=nums[0];
        n=0;
        int count1=0,count2=0;
        while(true)
        {
            if(sum==k)
            {
                ++count1;
                if((ptr2-ptr1+1)>n)
                n=ptr2-ptr1+1;
                ++ptr1;
                ++ptr2;
            }
            else if(sum<k)
            {
                ++ptr2;
                ++count2;
            }
            else
            {
                ++ptr1;
            }
            if(ptr2==nums.length)
            break;
            if(count1==1)
            {
                sum=sum-nums[ptr1-1]+nums[ptr2];
                count1=0;
            }
            else if(count2==1)
            {
                sum+=nums[ptr2];
                count2=0;
            }
            else
                sum-=nums[ptr1-1];
        }
         System.out.println(n);
    }
}