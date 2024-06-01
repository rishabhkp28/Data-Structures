import java.io.*;
public class bufferedreadertest
{
    public static void main(String args[])throws IOException //this is for checked exception due to readline
    {
        System.out.println("This is the input");
        InputStreamReader isr = new InputStreamReader(System.in);//takes byte stream and convert it into char 
        BufferedReader bfr =new BufferedReader(isr);//loads that char stream to RAM
        int i = Integer.parseInt(bfr.readLine());
        System.out.println("Enter the value of the string input");
        String s = bfr.readLine();
        System.out.println("Enter the value of char");
        int c =bfr.read();
        System.out.printf("The value of the input is %d\n",i);
        System.out.printf("The value of the Stirng input is %s\n",s);
        System.out.printf("The value of the char input is %d",c);
    }
}