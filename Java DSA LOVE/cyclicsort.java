public class cyclicsort
{
    public static void main(String args[])
    {
        int []A = new int[]{6,3,2,1,4,5};
        for(int i =0 ; i<A.length -1;)
        {
            int temp;
            if(i!=A[i]-1)
            {
             temp = A[A[i]-1];
             A[A[i]-1]= A[i];
             A[i]=temp;
            }
            if(i==A[i]-1)
            ++i;
        }
    
    for(int i:A)
    System.out.println(i);
    }
}