public class insertionsortrecursion
{
    public static void sorter(int []arr,int pass,int index)
    {
        if(pass==arr.length)//the end game condition
        return;
        else if(index==0)//the end pass condition|| can be included but i already did it in else part
        //arr[index]>arr[index-1]
        {
            sorter(arr,pass+1,pass+1);
        }
        else
        {
            if(arr[index]<arr[index-1])//the normal condition
            {
                int temp = arr[index];
                arr[index]=arr[index-1];
                arr[index-1] =temp;
                sorter(arr,pass,index-1);
            }
            else
            sorter(arr,pass+1,pass+1);

        }


    }
    public static void main(String args[])
    {
        int[] arr = new int[]{1,31,43,11,4,52,56};
        sorter(arr,1,1);
        for(int i : arr)
        System.out.println(i);
    }
}