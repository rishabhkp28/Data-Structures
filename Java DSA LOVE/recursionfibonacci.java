public class recursionfibonacci
{
    public int recfibo(int n)
    {
        if(n<3)
        return n-1;
        else 
        return recfibo(n-1) + recfibo(n-2);
    }
    public static void main(String args[])
    {
        recursionfibonacci obj = new recursionfibonacci();
        System.out.println(obj.recfibo(4));
    }
}