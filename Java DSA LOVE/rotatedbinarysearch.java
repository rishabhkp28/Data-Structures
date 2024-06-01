public class rotatedbinarysearch
{
    public static void main(String args[])
    {
        int arr[] = new int[]{23,34,45,56,1,3,5,7,9,10};
        int mid=0;
        int target =45 ,ul=arr.length-1,ll=0;
        while(ul>=ll)
        {
             mid = ll + (ul-ll)/2 ;
//no need to compare mid array element anywhere.
            if(arr[mid]==target)
            break;
            else if(arr[mid]>=arr[ll])
            {
                if(target<arr[mid] && target>=arr[ll])
                ul=mid-1;
                else
                ll =mid+1;
            }
            else
            {
                if(target>arr[mid] && target<=arr[ul])
                ll =mid+1;
                else
                ul=mid-1;
            }
        }
        if(ul<ll)
        System.out.println("Element not found");
        else
        System.out.println("Element is found at "+(mid)+"index");
        

    }
}