public class bubblesortrecursion
{
    public static void sorter(int[] arr , int pass,int index)
    {
        if(pass == arr.length)
        {
            return;
        }
        else if(index == arr.length-pass)
        {
            sorter(arr,pass+1,0);

        }
        else if(arr[index]>arr[index+1])
        {
            int temp = arr[index];
            arr[index]=arr[index+1];
            arr[index+1]=temp;
            sorter(arr,pass,index+1);
        }
        else
        sorter(arr,pass,index+1);
    }
    public static void main(String args[])
    {
        int[] arr = new int[]{1,31,43,11,4,52,56};
        sorter(arr,1,arr.length-2);
        for(int i : arr)
        System.out.println(i);
    }
}