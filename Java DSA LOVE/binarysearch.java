public class binarysearch
{
    public static int binary_search(int key,int lower,int upper,int[]A)
    {
        int mid = (lower+upper)/2;
        if(upper<lower)
        {
            return -1;
        }
        else if(A[mid]>key)
        {
            return binary_search(key,lower,mid-1,A);
        }
        else if(A[mid]<key)
        {
            return binary_search(key,mid+1,upper,A);
        }
        else
        {
            return mid;
        }
    }
    
    public static void main(String[] args)
    {
        int[] A = {1,5,7,12,34,56,57,80,81,83,90};
        int index = binary_search(83,0,10,A);
        System.out.println("The element is found at position : "+(index+1));

    }
}