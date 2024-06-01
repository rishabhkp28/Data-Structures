public class second_largest
{
    public static void main(String args[])
    {
        int []arr = new int[]{1,8,3,4,3,86,42,6};
        int largest = arr[0];
        for(int i =0;i<=arr.length-1;++i)
        {
            if(arr[i]>largest)
            {
                largest = arr[i];
            }
        }
        System.out.println("The largest is "+largest);
        int difference =Integer.MAX_VALUE ;
        for(int j=0 ; j<arr.length ; ++j)
        {
            if(largest-arr[j]<difference && largest != arr[j])
            {
                difference = largest-arr[j];
            }
        }
        System.out.println("The second largest is "+ (largest-difference));
    }
}