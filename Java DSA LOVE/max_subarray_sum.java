public class max_subarray_sum {
    public static void main(String args[])
    {
        int nums[] = new int[]{-2,-4,1,-1,-3};
        int sum = 0;
        int maxsum=nums[0];
        for(int i=0;i<=nums.length-1;i++)
        {
            sum += nums[i];
            if(sum > maxsum)
                maxsum = sum;
            if(sum < 0)
                sum = 0;
        }
        System.out.println(maxsum);
    }
}
