public class stringbuffer
{
    public static void main(String args[])
    {
        StringBuffer sb= new StringBuffer(14);
        System.out.println(sb.capacity());//capacity increased by prev*2+1
        System.out.println(sb.length());//capacity increased by prev*2+1
        System.out.print(sb);
        StringBuffer sb1= new StringBuffer("RISHABH");

        System.out.println(sb1.capacity());//capacity increased by prev*2+1

        System.out.println("over");
    }
}