public class floor
{//last occurence
    public static void main(String args[])
    {
        int ptr1 = 0;
        int[] A = new int[]{1,9,9,9,9,17,19,22,45,140};
        int ptr2 = A.length-1;
        int key =9;
        int mid=0;
        int answer = 0;
        while(ptr1<=ptr2)
        {
            mid = (ptr1+ptr2)/2;
            if(A[mid]<=key)
            {
                answer = A[mid];
                ptr1= mid+1;
            }
            else 
            {
                ptr2= mid-1;
            }
        }//same is giving us the answer of ceil and floor
            System.out.println("answer "+ answer);
            System.out.println(ptr2);
    }


}
