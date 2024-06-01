import java.util.*;
public class two_d_array
{
    public static int countones(ArrayList<ArrayList<Integer>> matrix,int row)
    {
        int ll =0;
        int start =matrix.get(0).size();
        int ul = (matrix.get(0)).size()-1;
        while(ll<=ul)
        {
            int mid = ll + (ul-ll)/2;
            if(1==(matrix.get(row)).get(mid))
            {
                start = mid;
                ul = mid-1;
            }
            else 
            ll = mid+1;
        }

        return (matrix.get(0)).size()-1-start+1;
    }
    public static int maximumOnesRow(ArrayList<ArrayList<Integer>> matrix, int n, int m)
    {
        int down = n-1;
        int up =0;
        int index =0;
        int highest =0;
        while(down>=up)
        {
            int count = countones(matrix,up);
            if(count>highest)
            {
                highest = count;
                index = up;
            }
            ++up;
        }
        return index;
    }
    public static void main(String arrs[])
    {
        ArrayList <ArrayList<Integer>> outerlist = new ArrayList<>();
        ArrayList <Integer> inner1 = new ArrayList<>();
        inner1.addAll(Arrays.asList(0,0,0,0,0));
        ArrayList <Integer> inner2 = new ArrayList<>();
        inner2.addAll(Arrays.asList(0,0,1,1,1));
        ArrayList <Integer> inner3 = new ArrayList<>();
        inner3.addAll(Arrays.asList(0,0,0,0,1));
        ArrayList <Integer> inner4 = new ArrayList<>();
        inner4.addAll(Arrays.asList(0,0,0,1,1));
        ArrayList <Integer> inner5 = new ArrayList<>();
        inner5.addAll(Arrays.asList(0,1,1,1,1));//its a fixed size list
        outerlist.addAll(Arrays.asList(inner1,inner2,inner3,inner4,inner5));
        System.out.println(maximumOnesRow(outerlist,5,5));
    }
}