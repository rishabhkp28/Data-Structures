import java.io.*;
public class insertionsort
{
    public static void main(String[] args)throws IOException
    {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader bfr = new BufferedReader(isr);
            System.out.println("Enter the size of the array :");
            int n=Integer.parseInt(bfr.readLine());
            int A[] =  new int[n];
            for(int i =0;i<=n-1;i++)
               {
                   System.out.println("Enter the value of the "+(i+1)+"th element :-");
                   A[i]=Integer.parseInt(bfr.readLine());
               }
            int temp =0;int exit=0;
            for(int i =1;i<=n;i++)
            {
                for(int j = i-2;j>=0;j--)
                {
                    if(A[j]>A[j+1])
                    {
                        temp = A[j];
                        A[j]=A[j+1];
                        A[j+1]=temp;
                    }
                    else if(A[j]>A[j+1])
                    continue;
                    else
                    break;
                }

            }
            System.out.println("The elements in sorted order are :-");
            for(int i =0;i<=n-1;i++)
            {
                System.out.println(A[i]);
            }

    }
}