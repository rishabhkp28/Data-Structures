public class majorityelement
{
    public static void main(String args[])
    {
        int[] arr = new int[]{6,5,5};
        int n = Integer.MAX_VALUE;
        int count=0;
        for(int i = 0 ;i<=arr.length-1;i++) 
        {
            if(count==0)
            {
                n=arr[i];
                count+=1;
            }
            if(arr[i]==n)
            ++count;
            else
            --count;
            
        }      
        System.out.println(n); 
    }
}