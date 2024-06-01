public class inversions
{
        
        public static int mergesort(int arr[],int low,int high)
        {
            int inversions=0;
            int mid = low+(high-low)/2;
            if(high==low)
            return inversions;
            else
            {
            inversions += mergesort(arr,low,mid);
            inversions += mergesort(arr,mid+1,high);
            inversions += merge(arr,low,mid,high);
            return inversions;
            }
        }
        public static int merge(int arr[],int l ,int m,int h)
        {
            int temp[] = new int[arr.length];
            int ptr1=l;
            int ptr2 = m+1;
            int tempptr=0;int inversions =0;
            while(ptr1<=m&&ptr2<=h)
            {
                if(arr[ptr1]<=arr[ptr2])
                {
                    temp[l+tempptr++]=arr[ptr1++];
    
                }
                else 
                {
                    inversions+=m-ptr1+1;
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
            return inversions;
        }
        public static void main(String args[]) 
        {
            int arr[] = new int[]{5, 4, 3, 2, 1};
            int inversions =0;
            inversions+= mergesort(arr,0,arr.length-1);
            for(int i = 0;i<arr.length;++i)
            {
                System.out.println(arr[i]);
            }
            System.out.println("inversions are "+inversions);
        }  
    
    
}