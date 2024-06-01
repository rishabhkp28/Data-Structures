public class factorialbyrecursion
{
    public static int facto(int n)
    {
        if(n==1)
        return 1;
        else
        return(n*facto(n-1));
    }
    public static void main(String args[])
    {
        int factorial = facto(7);
        System.out.println(factorial);
    }
}