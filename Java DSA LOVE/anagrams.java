import java.io.*;
import java.util.*;

public class anagrams {

    public static void main(String[] args)throws IOException
    {
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader bf = new BufferedReader(isr);
        String s1 = bf.readLine();
        String s2 = bf.readLine();
        String s3 = s1;
        char ch ;
        int a=0,b=0,flag=0;
        if(s1.length()==s2.length())
        for(int i =0 ; i<=s3.length()-1;i++)
        {
            ch = s3.charAt(i);a=0;b=0;

            for(int j = 0;j<=s1.length()-1;++j)
            {
                if(Character.toUpperCase(ch)==Character.toUpperCase(s1.charAt(j)))
                ++a;
            }
            for(int k = 0;k<=s2.length()-1;++k)
            {
                if(Character.toUpperCase(ch)==Character.toUpperCase(s2.charAt(k)))

                ++b;
            }
            if(a==b)
             {
                s1=s1.replaceAll(String.valueOf(ch),"");
                s2=s2.replaceAll(String.valueOf(ch),"");
                s3=s3.replaceAll(String.valueOf(ch),"");
                i=-1;
             } 
             else
             {
                ++flag;
                break;
             }
        } 
        else
        ++flag;
        if(flag==1)
        {
            System.out.println("Not Anagrams");
        }     
        else
        {
            System.out.println("Anagrams");
        }
        
    }
}