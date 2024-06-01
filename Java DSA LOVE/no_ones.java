import java.util.ArrayList;
import java.util.List;
public class no_ones {
    //program is for generating string without consequtive ones
    //for just counting we can use DP optimized approach; as in gfg practice
    public static List< String > generateString(int N) {
        List<String> list  = new ArrayList<String>();
        list.add(String.format("%0" + N + "d",Integer.parseInt("0")));
        if(N==1) {
            list.add("1");
            return list;
        }
        else
        adder("1",list,N);

        return list;
    }
    public static void adder(String s,List<String> list,int n)
    {
        if(n==s.length())
            return ;
        else if(s.charAt(s.length()-1)=='0')
        {
            String s1 = s +"0";
            list.add(String.format("%0" + n + "d",Integer.parseInt(s1)));
            adder(s1, list, n);

            String s2 = s+"1";
            list.add(String.format("%0" + n + "d",Integer.parseInt(s2)));
            adder(s2,list,n);
        }
        else
        {
            String s2 = s+"0";
            list.add(String.format("%0" + n + "d",Integer.parseInt(s2)));
            adder(s2,list,n);
        }
    }
    public static void main(String args[])
    {
        List<String> list  = new ArrayList<String>();
        list = generateString(4);
        System.out.println(list);
    }
}
