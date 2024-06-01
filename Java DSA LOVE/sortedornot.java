import java.util.*;
public class sortedornot
{
    static int  i = 0;
    public static boolean arraychecker(int[] array)
    {
        if(i==array.length-1)
        {
          return true;
        }
        else if (array[i]<=array[i+1])
        {
            ++i;
            return arraychecker(array);
        }
        else
        return false;
    }
    
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int array[] = new int[n]; 
        for(int i =0;i<=n-1;++i)
        {
            array[i] = sc.nextInt();
        }
        boolean value = arraychecker(array);
        
        if(value==false)
        {
            System.out.println("Array isn't sorted");
        }
        else
        System.out.println("Array is sorted");

    }
}