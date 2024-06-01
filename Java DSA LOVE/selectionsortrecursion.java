public class selectionsortrecursion
{
    public static void sorter(int[] arr,int pass,int index,int sindex)
    {
        //sindex is the index of smallest number
        if(pass==arr.length)//first write the all end condition
        return ;
        else if(index == arr.length)//then writee the full pass end condition
        {
            int temp = arr[sindex];
            arr[sindex]=arr[pass-1];
            arr[pass-1]= temp;
            sorter(arr,pass+1,pass,pass);
        }
        else
        {
            if(arr[sindex]>arr[index])//then the normal conditon for reaching the end of each pass
            {
                sindex = index;
            }
            sorter(arr,pass,index+1,sindex);

        } 
    }

    public static void main(String args[])
    {
        int[] arr = new int[]{1,31,43,11,4,52,56};
        sorter(arr,1,0,0);
        for(int i : arr)
        System.out.println(i);
    }
}