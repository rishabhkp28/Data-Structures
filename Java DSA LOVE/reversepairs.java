public class reversepairs
{
    public static int mergesort(int arr[],int low,int high)
    {
        int mid = low+(high-low)/2;
        int revpair=0;
        if(high==low)
        return revpair;
        else
        {
            revpair+= mergesort(arr,low,mid);
            revpair+= mergesort(arr,mid+1,high);
            revpair+= countrevpairs(arr,low,mid,high);
            merge(arr,low,mid,high);
            return revpair;
        }
    }
    public static int countrevpairs(int[] arr, int l , int m , int h)
    {
        int revpair = 0;
        int ptr1=l,ptr2=m+1;
        while(ptr1<=m && ptr2<=h)
        {
            
            if(arr[ptr1] > 2 * (long)arr[ptr2])
            {
                revpair+=m-ptr1+1;
                ++ptr2;
            }
            else
            ++ptr1;            
        }
        return revpair;
    }
    public static void merge(int arr[],int l ,int m,int h)
    {
        int temp[] = new int[arr.length];
        int ptr1=l;
        int ptr2 = m+1;
        int tempptr=0;
        int revpair=0;
        while(ptr1<=m&&ptr2<=h)
        {
            if(arr[ptr1]<=arr[ptr2])
            {
                temp[l+tempptr++]=arr[ptr1++];

            }
            else 
            {
                revpair+=m-ptr1+1;
                temp[l+tempptr++]=arr[ptr2++];
            }
        }
        if(ptr1>m)
        {
            while(ptr2<=h)
            {
                temp[l+tempptr++] = arr[ptr2++];
            }
        }
        else
        {
                        
            while(ptr1<=m)
            {
                temp[l+tempptr++] = arr[ptr1];
                ptr1++;
            }
        }
        tempptr=0;
        for(int i = l;i<=h;++i)
        {
            arr[i]=temp[l+tempptr++];
        }

    }
    public static void main(String args[]) 
    {
        int arr[] = new int[]{2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        int revpair = mergesort(arr,0,arr.length-1);
        for(int i = 0;i<arr.length;++i)
        {
            System.out.println(arr[i]);
        }
        System.out.println("revpairs are "+revpair);
    }  

}