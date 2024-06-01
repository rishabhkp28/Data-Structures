import java.util.HashSet;
public class consequtive_sequence
{
    public static void main(String args[])
    {
        int[] arr = new int[]{9,6,1,9,4,5,3};
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i =0;i<arr.length;i++)
        {
            hs.add(arr[i]);
        }
        int count=0;
        int maxcount=1;
        for(int x : hs)
        {
            if(!hs.contains(x-1))
            {            //xtemp
                count=0;
                //in case we want the sequence too then we need to declare xtempand xpermanent
                while(hs.contains(x))
                {
                    ++count;
                    x =x+1;
                }
                if(maxcount<count)
                {
                    //xpermanent
                    maxcount = count;
                }
            }
            else
            continue;
        }
        System.out.println(maxcount);
    
    }
}