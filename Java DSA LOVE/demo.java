public class demo
{
    public static int x = 10;
    public static int y = 20;
    public static void main(String args[])
    {
        System.out.println("THE x is "+x+" THE y is "+y);
        callbyvalue(x,y);//so that we could call without creating object we declare them static
        System.out.println("THE x is "+x+" THE y is "+y);
        demo demoobj =new demo();
        callbyref(demoobj);
        System.out.println("THE x is "+x+" THE y is "+y);
    }
    public static void callbyvalue(int x, int y)
    {
        int temp = x;
        x=y;
        y=temp;
    }
    public static void callbyref(demo obj)
    {
        int temp = obj.x;
        obj.x=obj.y;
        obj.y= temp;
        }
}