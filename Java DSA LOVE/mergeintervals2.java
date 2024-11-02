
import java.util.*;

public class mergeintervals2 {
    public static class customcomparator implements Comparator<int[]>
    {
        @Override
        public int compare(int[] A, int[] B)
        {
            return Integer.compare(A[0],B[0]);
        }
    }
    public static void main(String args[])
    {
        int[][] intervals = new int[][]{{1,3},{6,9},{2,5}};
        Arrays.sort(intervals,new customcomparator());
        ArrayList<int[]> list  = new ArrayList<>();
        for(int[] arr : intervals)
            list.add(arr);

        int i =0;

        while(i<=list.size()-2)
        {
            //first of next interval lie between the first interval
            if(list.get(i)[1]>=list.get(i+1)[1])
                list.remove(i+1);
            else if(list.get(i)[1]>=list.get(i+1)[0])//even if equal merge them
            {
                int[] arr = list.get(i);
                arr[1] = list.get(i+1)[1];
                list.remove(i+1);
            }
            else
                ++i;
        }

        int[][] re = new int[list.size()][2];

        for(i=0;i<=list.size()-1;i++)
            re[i] = list.get(i);


        for(i =0;i<= re.length-1;i++)
        {
            for(int j =0;j<=1;j++)
            {
                System.out.print(re[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }


    }
}
