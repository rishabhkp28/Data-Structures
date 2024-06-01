import java.util.*;
public class mergeintervals
{
    public static void main(String args[])
    {
        int[][] array = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        List <int[]> list  = new ArrayList<>();
        int temp=0;
        for(int i = 1;  i <= array.length-1 ; ++i)
        {
            for(int j = 0;j<=array.length-1-i;++j)
            {

                if(array[j][0]>array[j+1][0])
                {
                    temp = array[j][0];
                    array[j][0] = array[j+1][0];
                    array[j+1][0] = temp;
                    temp = array[j][1];
                    array[j][1] = array[j+1][1];
                    array[j+1][1] = temp;
                }
            }
        }
        list.add(array[0]); 
        int ptr1=0;
        for(int i = 1 ;i<=array.length - 1 ; i++)
        {
            if(array[i][0]>=list.get(ptr1)[0] && array[i][0]<=list.get(ptr1)[1])
            {
                if(array[i][1]>list.get(ptr1)[1])
                {
                    
                    list.add(new int[]{list.get(ptr1)[0],array[i][1]});
                    list.remove(ptr1);//we cant write it before as we need to fetch element at ptr1 array index0;
                }
            }  
            else
            {
                ++ptr1;
                list.add(array[i]);
            } 
        }
        int[][] A = list.toArray(new int[list.size()][2]);
        for(int[]B : A)
        {
            for(int i=0;i<=B.length-1;++i)
            {
                System.out.print(B[i]+" ");
            }
            System.out.println("");
        }
        
            
    }
}
