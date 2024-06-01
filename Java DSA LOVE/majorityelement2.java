public class majorityelement2
{
    public static void main(String args[])
    {
        int[] arr = new int[]{1,2};
        int candidate1=Integer.MAX_VALUE;
        int candidate2=Integer.MAX_VALUE;
        int count1=0;
        int count2=0;
    for(int i =0;i<arr.length;i++)
    {
        if(count1==0 && candidate2!=arr[i] )
            {
                candidate1=arr[i];
                count1+=1;
            }
        else if(count2==0 && candidate1!=arr[i])
            {
                candidate2=arr[i];
                count2+=1;
            }
        else if(arr[i]==candidate1)
            {
                ++count1;
            }
        else if(arr[i]==candidate2)
            {
                ++count2;
            }
        else
            {
                --count1;
                --count2;
            }
    }
        int counter1=0,counter2=0;
        for(int i = 0 ;i<arr.length;i++)
        {
            if(arr[i]==candidate1)
            ++counter1;
            else if(arr[i]==candidate2)
            ++counter2;
        }
        if(counter1>Math.floor(arr.length/3))
        System.out.println(candidate1);
        if(counter2>Math.floor(arr.length/3))
        System.out.println(candidate2);
    }
}