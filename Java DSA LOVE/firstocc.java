class firstocc 
{
    public static int searchRange(int[] A, int key)
    {
        int ptr1 = 0;
        int ptr2 = A.length-1;
        int mid=0;
        int foc=-1;
        while(ptr1<=ptr2)
        {
            mid = (ptr1+ptr2)/2;
            if(A[mid]>key)
            {
                ptr2= mid-1;
            }
            else if(A[mid]<key)
            {
                ptr1= mid+1;
            }
            else
            {
                foc = mid;
                ptr2 = mid -1;
            }
        }
        return foc;

    }
        public static void main(String args[])
        {
            int foc = searchRange(new int[]{5,7,7,8,8,10}, 8);
            System.out.println(foc);
        }
}

