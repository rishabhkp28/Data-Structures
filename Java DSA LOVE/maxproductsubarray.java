public class maxproductsubarray
{
    public static void main(String args[])
    {
        int []arr = new int[]{-2,0,-1};
        int prefix=1,suffix=1;
        int max= Integer.MIN_VALUE;
        for(int i = 0 ;i<arr.length;i++)
        {
            if(suffix==0)
            suffix =1;
            if(prefix==0)
            prefix=1;
            prefix*=arr[i];
            suffix*=arr[arr.length-1-i];
            max= Math.max(max,Math.max(prefix,suffix));
        }
        
        System.out.println(max);
        
    }
}