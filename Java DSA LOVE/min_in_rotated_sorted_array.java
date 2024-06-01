public class min_in_rotated_sorted_array 
{
    public static int findMin(int[] arr) {
        int ll=0;
        int ul = arr.length-1;
        int ans =Integer.MAX_VALUE;
        while(ll<=ul)
        {
            int mid = ll+(ul-ll)/2;
            if(arr[ll]<=arr[ul])
               return Math.min(arr[ll],ans);//equal to here so that single element array dont fail
            else if(arr[ll]<=arr[mid])
            {   
                ll=mid+1;
            }
            else 
            {
                if(ans>arr[mid])
                ans = arr[mid];
                ul=mid-1;
            }
        }   
        return ans;     
    }
    public static void main(String args[])
    {
        System.out.println(findMin(new int[]{3,1,2}));
    }
}