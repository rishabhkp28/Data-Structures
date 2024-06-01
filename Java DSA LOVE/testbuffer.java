import java.io.*;
public class testbuffer
{
    public static void main(String args[])throws IOException
    {
        BufferedReader bfr= new BufferedReader(new InputStreamReader(System.in));
            
        String s = bfr.readLine();
        String p = bfr.readLine();
        System.out.println(s);
        System.out.println(p);


    }
}