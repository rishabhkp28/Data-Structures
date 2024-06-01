public class peakelement
{
        public static int findPeakElement(int[] arr) 
        {
                int ll = 0;
                int ul = arr.length-1;
                while(ul>=ll)
                {
                    int mid = ll+(ul-ll)/2;
                    boolean cond = mid<arr.length-1;
                    double right =cond? arr[mid+1]:Double.NEGATIVE_INFINITY;
                    double left = mid>0? arr[mid-1]:Double.NEGATIVE_INFINITY;
                    if(arr[mid]>right && left<arr[mid])
                    {
                        return mid;
                    }
                    else if(arr[mid]>right)
                    {
                        ul = mid-1;
                    }
                    else 
                        ll=mid+1;
                }
                return -1;
        }
    
    public static void main(String args[])
    {
        int[] matrix = new int[]{-2147483648};
        int answer = findPeakElement(matrix);
        System.out.println(answer);
    }
    
}