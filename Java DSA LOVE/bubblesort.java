import java.io.*;
public class bubblesort
{
    public static void main(String []args)throws IOException
    {
        int temp=0;int exit = 0;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(isr);
        //System.out.println("Enter the size of the array :");
        //int n=Integer.parseInt(bfr.readLine());
        int A[] =  new int[]{1,8,6,3,7,6,1,34};    
        int n =8;
        //for(int i =0;i<=n-1;i++)
        //    {
        //        System.out.println("Enter the value of the "+(i+1)+"th element :-");
        //        A[i]=Integer.parseInt(bfr.readLine());
        //    }
        for(int i =1;i<=n-1;i++)
        {
            for(int j =0 ;j<=n-1-(i);j++)
            {
                if(A[j]>A[j+1])
                {
                    ++exit;
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1]=temp;
                }
            }
            if(exit ==  0) 
            break;
        }   
            System.out.println("The elements in sorted order are :-");
            for(int i =0;i<=n-1;i++)
            {
                System.out.println(A[i]);
            }
        
    }
}