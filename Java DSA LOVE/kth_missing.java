public class kth_missing
{
    public static void main(String args[]) 
    {
        
        int arr[] = new int[]{1,3};
        int ll = 0;
        int ul = arr.length-1;
        int missing_till_now = 0;
        int lower_limit_of_missing =0 ;
        int k = 1;
        if(arr[0]>k)
        {
            System.out.println(k);
        }
        while(ul>=ll)
        {
            int mid = ll+(ul-ll)/2;
            missing_till_now = arr[mid]-1-mid;
            if(k>missing_till_now)
            {
                lower_limit_of_missing =mid;
                ll=mid+1;
            }
            else
            {
                ul = mid-1;
            }
        }
    
        System.out.println(k-(arr[lower_limit_of_missing]-(lower_limit_of_missing+1))+arr[lower_limit_of_missing]);
    }
}

