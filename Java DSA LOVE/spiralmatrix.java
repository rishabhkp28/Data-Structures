import java.util.ArrayList;
public class spiralmatrix
{
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int arr[][] = new int[][]{
            {1,2,3}
        };
       
        int top=0,bottom=arr.length-1,left=0,right=arr[0].length-1;
        while(top<=bottom && left<=right) //if any condition is satisfied it means all elements hasve got printed
    {//if i use or then it leads to out of bounds
            for(int i=left;i<=right;i++)
            {
                list.add(arr[top][i]);
            }
            ++top;
            for(int i =top;i<=bottom-1;i++)
            {
                list.add(arr[i][right]);
            }
            if(top<=bottom)//for preventing redundant addition
            for(int i=right;i>=left; --i)
            {
                list.add(arr[bottom][i]);
            }
            --right;
            --bottom;
            if(left<=right)//for preventing reedundant addtion
            for(int i =bottom;i>=top;--i)
            {
                list.add(arr[i][left]);
            }
            ++left;
        }
            
        for(int i : list)
        {
            System.out.println(i);
        }
    }
}