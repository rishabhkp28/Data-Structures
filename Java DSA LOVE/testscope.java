public class testscope
{
    public static class scope
    {
        int a ;
        int b ;
        scope(int a , int b)
        {
            this.a=a;
            this.b =b;
        }
    }
    public static scope d1=null;

    public static void main(String args[])
    {
        scope d1= new scope(3,4);
        System.out.println(d1);
        caller(d1);
        System.out.println(d1);
    }
    public static void caller(scope d1)
    {
        d1 = new scope(2,3);// if there exists two variables with the same name , one of them local and other global then the local variable is given more preference;
        System.out.println(d1);
    }
}