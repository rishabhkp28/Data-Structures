public class mergesortrecursion
{
    static int inversions;
    public static void mergesort(int arr[],int low,int high)
    {
        int mid = low+(high-low)/2;
        if(high==low)
        return;
        else
        {
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public static void merge(int arr[],int l ,int m,int h)
    {
        int temp[] = new int[h-l+1];
        int ptr1=l;
        int ptr2 = m+1;
        int tempptr=0;
        while(ptr1<=m&&ptr2<=h)
        {
            if(arr[ptr1]<=arr[ptr2])
            {
                temp[tempptr++]=arr[ptr1++];

            }
            else 
            {
                inversions+=m-ptr1+1;
                temp[tempptr++]=arr[ptr2++];
            }
        }
        if(ptr1>m)
        {
            while(ptr2<=h)
            {
                temp[tempptr++] = arr[ptr2++];
            }
        }
        else
        {
                        
            while(ptr1<=m)
            {
                temp[tempptr++] = arr[ptr1];
                ptr1++;
            }
        }
        tempptr=0;
        for(int i = l;i<=h;++i)
        {
            arr[i]=temp[tempptr++];
        }

    }
    public static void main(String args[]) 
    {
        int arr[] = new int[]{5, 4, 3, 2, 1};
        mergesort(arr,0,arr.length-1);
        for(int i = 0;i<arr.length;++i)
        {
            System.out.println(arr[i]);
        }
        System.out.println("inversions are "+inversions);
    }  

}