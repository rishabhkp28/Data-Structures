
class splitsum {
        public int splitArray(int[] nums, int k) {
            int ul = nums[0];
            int ll= nums[0];
            for(int i = 1 ;i<nums.length;i++)
            {
               ul += nums[i]; 
               ll = Math.max(nums[i],ll);
            }
            int sum = 0 ; int temp = 0 ;int m = 0;
            while(ll<=ul)
            {
                sum = ll + (ul-ll)/2;
                for(int i =0;i<nums.length;i++)
                {
                    temp+=nums[i];
                    if(temp>sum)
                    {
                        temp=0;
                        ++m;--i;
                    }
                    if(i==nums.length-1)
                    {
                        m=m+1;temp=0;
                    }
                    
                }
                if(m>k)
                ll=sum+1;
                else if(m<k)
                ul=sum-1;
                else if(ll==ul)
                return sum;
                else
                ul=sum;
                m=0;
            }
            return sum;
        }
    
    public static void main(String args[])
    {
        int[] array = {7,2,5,10,8};
        splitsum obj = new splitsum();
        System.out.println(obj.splitArray(array,2));
    }
}