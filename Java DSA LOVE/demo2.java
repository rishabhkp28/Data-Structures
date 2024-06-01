import java.util.Comparator;

public class demo2
{
    public int x = 10;
    public int y = 20;
    public static void main(String RGS[])
    {
        demo2 demoobj =new demo2();
        demoobj.zindabad(demoobj);
    }
    public void zindabad(demo2 demoobj)
    {
        System.out.println("THE x is "+x+" THE y is "+y);
        demoobj.callbyvalue(x,y);//so that we could call without creating object we declare them static
        System.out.println("THE x is "+x+" THE y is "+y);
        demoobj.callbyref(demoobj);
        System.out.println("THE x is "+x+" THE y is "+y);
        demo2 demoobj2 =new demo2();
        System.out.println("THIS is after the new object is created");
        System.out.println("THE x is "+demoobj2.x+" THE y is "+demoobj2.y);
    }//all the changes were only in the previous object and not on new one;
    public void callbyvalue(int x, int y)
    {
        int temp = x;
        x=y;
        y=temp;
    }
    public void callbyref(demo2 demoobj)
    {
        int temp = demoobj.x;
        demoobj.x=demoobj.y;
        demoobj.y= temp;
        }
}