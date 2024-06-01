public class multiarray2
{
    public static void main(String args[])
    {
        int A[][] =new int[][]{{1},{4,5},{6,7,8},{9,10,6,11}};//or declare rows only
        for(int i = 0;i<=A.length-1;i++) 
        {
            System.out.println(A[i]);
        }
        System.out.println("===================================================");
        for(int i = 0;i<=A.length-1;i++)
        {
            for(int j =0;j<=A[i].length -1;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}