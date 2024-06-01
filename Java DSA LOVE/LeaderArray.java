public class LeaderArray
{
    public static void main(String args[])
    {
        int arr[] = new int[]{1,6,3,7,3,9,7,8};
        int lead = arr[arr.length-1];
        for(int i = arr.length-1;i>0;--i)
        {
            if(arr[i]>lead)
            {
                lead = arr[i];
            }
            System.out.println(lead);
        }
    }
}