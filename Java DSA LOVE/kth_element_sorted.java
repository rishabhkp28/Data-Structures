public class kth_element_sorted
{
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int n = nums1.length;
        int m = nums2.length;
        if(n>m)
        return findMedianSortedArrays(nums2,nums1);
        int k = 12 ;
        int ul =0;
        int ll=0;
        if(k>=m)
        ll =k-m;
        else 
        ll = 0;

        if(k<n)
        {
            ul = k;
        }
        else
        {
            ul = n;
        }
        int answer =0;
        while(ul>=ll)
        {
            int select = ll+ (ul-ll)/2;

            int Aleft = select>0? nums1[select-1]:Integer.MIN_VALUE;
            int Aright= select<n? nums1[select]:Integer.MAX_VALUE;

            int rest = k- select ;
            int Bleft = rest>0?nums2[rest -1]: Integer.MIN_VALUE;
            int Bright = rest<m? nums2[rest]:Integer.MAX_VALUE;

            if(Aleft>Bright)
            {
                ul = select-1;
            }
            else if(Bleft>Aright)
            {
                ll=select + 1 ;
            }
            else
            {
                
                    return Math.max(Aleft,Bleft);
                }
            
        }
        return 0;//dummy statement
    }
    
    public static void main(String args[])
    {
        int[] arr1 = new int[]{76,94,100};
        int[] arr2 = new int[]{5,5, 9, 11 ,31, 36 ,68 ,71, 75, 100 };
        System.out.println(findMedianSortedArrays(arr1,arr2));
    }    
}