public class second_smallest
{
    public static int secondSmallest(int[] arr)
    {
        if(arr.length<2)
        return -1;
        else
        {
            int small=Integer.MAX_VALUE;
            int secondsmall=Integer.MAX_VALUE;
            for(int i = 0 ;i<=arr.length-1;++i)
            {
                if(arr[i]<small)
                {
                    secondsmall=small;
                    small=arr[i];
                }
                else if(arr[i]<secondsmall&&arr[i]!=small)
                {
                    secondsmall=arr[i];
                }

            }
            return secondsmall;

        }
    }
    public static void main(String args[])
    {
        int[] arr = {1, 2, 4, 7, 7, 5};
        int sS=0;
        if(arr.length==1)
        {
            System.out.println("Already sorted");
            return;
        }
        else
		     sS = secondSmallest(arr);
	    System.out.println("Second smallest is "+sS);

    }
}