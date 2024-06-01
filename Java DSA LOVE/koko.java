public class koko
{
    
        public static int calculate_time(int k,int[] arr)
        {
            int sum = 0;
            for(int i = 0 ;i<arr.length;i++)
            {
                sum+=Math.ceil(((double)arr[i])/k);
            }
            return sum;
        }
        public static int minEatingSpeed(int[] piles, int h) 
        {
            int ul = Integer.MIN_VALUE;
            for(int i = 0 ;i<piles.length;i++)
            {
                ul = Math.max(piles[i],ul);
            }
            int ll = 1;
            int answer = Integer.MAX_VALUE;
            while(ul>=ll)
            {
                int mid = ll+(ul-ll)/2;
                int time = calculate_time(mid,piles);
                if(time>h)
                {
                    ll = mid+1;
                }
                else 
                {
                    answer = mid;
                    ul = mid-1;
                }
               
            }
            return answer;
        }
    
    public static void main(String args[])
    {
        int arr[] = new int[]{312884470};
        System.out.println(minEatingSpeed(arr,312884469));
        
        
    }
}