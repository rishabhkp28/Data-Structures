import java.io.*;
public class selectionsorttime
{
    public static void main(String args[])throws IOException 
    {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader bfr = new BufferedReader(isr);
           System.out.println("Enter the size of the array :");
            int n=Integer.parseInt(bfr.readLine());
            int A[] =  new int[n];
            int temp =0,index= 0;
            for(int i =0;i<=n-1;i++)
               {
                   System.out.println("Enter the value of the "+(i+1)+"th element :-");
                   A[i]=Integer.parseInt(bfr.readLine());
               }
            for(int i = 0;i<=n-2;i++)
            {
                index = i;
                for(int j = i+1 ; j <=n-1;j++)
                {
                    if(A[index]>A[j])
                    {
                        index=j;
                    }
                }
                        temp = A[i];
                        A[i]=A[index];
                        A[index]=temp;
            }
            System.out.println("The elements in sorted order are :-");
            for(int i =0;i<=n-1;i++)
            {
                System.out.println(A[i]);
            }
            
            
    }
}