public class quicksortrecursion
{
    public static void quicksort(int arr[],int low,int high)
    {
        if(high<=low)
        return;
        else
        {
           int index =  pivotplacement(arr,low,high);//placing the element at correct posn
           quicksort(arr,low,index-1);//for placing the correct position of left element
           quicksort(arr,index+1,high);//for placing the correct position of right element
        }

    }
    public static int pivotplacement(int []arr,int low,int high)
    {
        int ptr1 = low+1;
        int ptr2 = high;
        int pivot = arr[low];
        while(ptr1<=ptr2)
        {
            while(ptr1<=ptr2 && arr[ptr1]<=pivot )
            ++ptr1;
            while(ptr1<=ptr2 && arr[ptr2]>=pivot )
            --ptr2;

            //swapping the element at lower index
            if(ptr1<=ptr2)
            {
                int temp = arr[ptr1];
                arr[ptr1] = arr[ptr2];
                arr[ptr2] = temp;
                ++ptr1;
                --ptr2; 
            }
            else
            {
                int temp = arr[ptr2];
                arr[ptr2 ] = arr[low];
                arr[low] = temp;
                return ptr2;
            }
        }
        return -1;//dummy indexx 
    }

    public static void main(String args[])
    {
        int array[] = new int[]{5,2,7,6,34,4,5,33,4};

        quicksort(array,0,array.length-1);

        for(int i =0;i<=array.length-1;i++)
        {
            System.out.println(array[i]);
        }
        
    }
}