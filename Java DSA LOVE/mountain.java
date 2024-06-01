class mountain {
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0,end = arr.length-1;
        int mid = 0;
        while(start!=end)
        {
            mid = (start+end)/2;
            if(arr[mid]>arr[mid+1])
            end=mid;
            else
            start = mid+1;
        }
        return end;
        
    }
    public static void main(String args[])
    {
        int ab =  peakIndexInMountainArray(new int[]{0,1,0});
        System.out.println(ab);
    }
}