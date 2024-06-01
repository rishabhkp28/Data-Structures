import java.util.List;
import java.util.ArrayList;
class tetetest {
    public static int firstMissingPositive(int[] nums) {
        for(int i =0 ; i<nums.length;)
                {
                    int temp;
                    if(i!=nums[i]-1 && nums[i]<= nums.length &&nums[i]>0)
                    {
                        temp = nums[nums[i]-1];
                        nums[nums[i]-1]=nums[i];
                        nums[i]=temp;
                    }
                    if ( i==nums[i]-1 || nums[i]>nums.length ||nums[i]<=0|| nums[i]==nums[nums[i]-1] )
                    ++i;
                } 
                int i;
                for( i = 0 ;i<=nums.length-1;i++)
                {
                    if(nums[i]!=i+1)
                    return i+1;
                }
                return 0;
    }
    public static void main(String args[])
    {
        int[] array = {3,4,-1,1};
        System.out.println(firstMissingPositive(array));

    }
}