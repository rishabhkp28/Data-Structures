public class wrapperc
{
    public static void main(String args[])
    {
        String s = new String("AAJ gadi tera bahi chalayega");//sent to string pool
        System.out.println(s);
        s="aaj nahi chalayega";/*When changes are made to the s then address of s changes
        but the initial s String remains in the String pool*/
        String s1 = "aaj nahi chalayega";//both s1 and s hold the same address
        System.out.println(s);
        s=s.concat("pqr");
        System.out.println(s);
    }
}