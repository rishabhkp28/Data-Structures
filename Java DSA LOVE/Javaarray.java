public class Javaarray
{
    int sumup(int A[])
    {
        int sum=0;
        for (int i =0;i<=A.length-1;i++)
        {
            sum += A[i];
        }
        return sum;
    }
    public static void main(String args[])
    {
        int A[]= {2,5,8,3,7};//leads to error if size is specified
        int B[] = new int[]{1,4,5};
        for(int i:B)
        System.out.println(i);
        Javaarray ob = new Javaarray();
        int result = ob.sumup(new int[]{1,2,4,2,4,3});//We cant pass the array directly here so its called concept of 
        //anonymous object;
        System.out.println(result);
    }
}