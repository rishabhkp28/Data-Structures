class rotateleft {
    public void rotate(int[] nums, int k) {
        for(int i = 0; i <=(k-1)/2 ;i++)
        {
            int temp = nums[i];
            nums[i]= nums[k-1-i];
            nums[k-1-i] = temp;
        }
        for(int i = k;i<=(((nums.length-k)-1)/2+k);++i)
        {
            int temp = nums[nums.length-i-1+k] ;
            nums[nums.length-i-1+k] = nums[i];
            nums[i] = temp;

        }

        for(int i = 0; i<= (nums.length-1)/2;++i)
        {
            int temp = nums[i];
            nums[i] = nums[nums.length - i -1];
            nums[nums.length - i -1] = temp;
        }
        
    }
    public static void main(String args[])
    {
        int nums[] = new int[]{1,4,5,2,9,8,7,6,4};
        rotateleft obj = new rotateleft();
        obj.rotate(nums,3);
        for (int i : nums) 
        {
            System.out.println(i);
        }
    }
}