public class binarysearch2d
{
    public int[] binarysearch(int A[][],int key)
    {
        if(A[0][0]<key)
        {
            int column = A.length-1,n=A.length-1;
            int row = 0;
            while(row<=n && column>=0)
            {
                if(A[row][column]>key)
                {
                    --column;
                }
                else if(A[row][column]<key)
                {
                    ++row;
                }
                else 
                return new int[]{row,column};
            }
            return new int[]{-1};//compiler doesnt want to take the risk as the while conditon may evaluate to 
                                //false and then function would have nothing to return to main;
                                //by the way this is here for the cases when key isn't found;
        }
        else if(A[0][0]==key)
        return new int[]{0,0};
        else
        return new int[]{-1}; 
    }
    public static void main(String []args)
    {
        int A[][]={{1,5,9,12},{3,6,10,15},{7,8,14,19},{16,17,40,90}};
        binarysearch2d obj = new binarysearch2d();
        int B[] = obj.binarysearch(A,40);
        if(B[0]==-1)
        System.out.println("The element is not present");
        else
        System.out.printf("The element is found at row %d column %d\n",B[0],B[1]);
    }
}
