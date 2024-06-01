import java.util.ArrayList;

public class permutation_of_array
{
    public static void swap(int i,int j ,int[]arr)
    {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    public static void permutation(int index, int[] arr , ArrayList<ArrayList<Integer>> alt)
    {
        if(index==arr.length)
        {
            ArrayList<Integer> tempList = new ArrayList<>();
            for (int element : arr) {
                tempList.add(element);
            }
            alt.add(tempList);
        }
        else
        {
            for(int i = index;i<arr.length;i++)
            {
                swap(index,i,arr);//array got changed we want the same again.
                permutation(index+1,arr,alt);
                swap(index,i,arr);//here we made the array same again.
            }
        }
    }
    
    public static void main(String args[])
    {
        int[] arr = new int[]{1,4,2};
        ArrayList <ArrayList <Integer>> alt = new ArrayList<>();
        permutation(0,arr,alt);
        System.out.println(alt);
    }
}