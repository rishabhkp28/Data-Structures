//import java.io.*;
//public class Main
//{
//	public static void main (String[] args)throws IOException
//	{
//	    InputStreamReader isr = new InputStreamReader(System.in);
//	    BufferedReader bfr = new BufferedReader(isr);
//        float a =Float.parseFloat(bfr.read());
//	    System.out.println("done");
//	    
//	}
//}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class parseint
{
   public static void main(String args[]) throws IOException 
   {
      BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter your age: ");
      int age = Integer.valueOf(reader.readLine());
      System.out.println("Enter your Id: ");
      int id = Integer.parseInt(reader.readLine());
   }
}
