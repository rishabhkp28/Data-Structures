public class multiarray
{
    public void printmultiarray(int [][] A)
    {
        for(int i =0;i<=2;i++)
        {
            for(int j =0;j<=5;j++)
            System.out.print(A[i][j]+" ");
            System.out.println("");
        }

    }
    public static void main(String[] args)
    {
        int C[] = new int[]{1,4,4,3,4};//one more way to declare an array
        for(int i:C)
        System.out.println(i);
       int A[][] = {{1,2,3,5,2,5},{2,4,5,3,4,3},{4,44,3,5,5,3}};
       multiarray obj =new multiarray();
        obj.printmultiarray(A);
       int B[][]= new int[][]{{1,3,4,2},{53,63,3},{6,74},{4}};
       for(int i = 0;i<B.length;i++ )
       {
        for(int j = 0 ;j<B[i].length;j++)
        {
            System.out.print(B[i][j]);
        }
        System.out.println("");
       }
       System.out.println("///////////////////////////////////////////////////////////////////////////");
       System.out.println("ONE MORE METHOD");
       for(int[]i: B)
       {
        for(int j :i)
        System.out.print(j);

        System.out.println("");
        System.out.println(5/2);
       }



    }
}