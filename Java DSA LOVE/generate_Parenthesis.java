import java.util.*;
public class generate_Parenthesis
{
    public static void main(String args[])
    {
        List<String> list = new ArrayList<String>();
        generator("",0,0,3,list);
        System.out.println(list);
    }
    public static void generator(String s,int open,int closed,int n,List<String> list)
    {
        if(open==closed  && s.length() == n*2)
        list.add(s);
        else if( open == closed )
        {
            s= s + "(" ;
            generator(s ,open+1,closed,n,list);
        }
        else if(open>closed )
        {

            if (open < n ) {
                String s1= s + "(";

                generator(s1, open + 1, closed, n, list);
            }
                String s2 = s + ")" ;
                generator(s2, open, closed + 1, n, list);
        }
    }
}


