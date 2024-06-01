import java.util.Comparator;
import java.util.Arrays;
public class longest_string_chain
{
    public static boolean nextchain(String s1,String s2)
    {
        //inbuilt s1 length is less than or equal to s2
        int ptr1 = 0, ptr2 = 0;
        if (s1.length() == s2.length() - 1)
        {
            while (ptr1 <= s1.length() && ptr2 <= s2.length())
            {
                if (ptr1 == s1.length()||ptr2==s2.length())//either both reach at last or only the ptr1 reaches last first
                {
                    if  (ptr1==s1.length() && (ptr2==s2.length()||ptr2==s2.length()-1))
                        return true;
                    else
                        return false;
                    /*in all the other cases the strings are not in accordance*/
                }
                else if (s1.charAt(ptr1) == s2.charAt(ptr2)) {
                    ++ptr1;
                    ++ptr2;
                } else
                    ++ptr2;// means not same character
            }
            return true;//although the result will always be given in the loop
        }

        else
            return false;
    }
    public static int tabulation(String[] arr)
    {

        int[] dp = new int[arr.length];
        int maxlength = 0;
        Arrays.fill(dp,1);
        for (int i = 1; i <= arr.length-1; i++) {
            for (int j = 0; j <= i; j++) {
                if ((nextchain(arr[j], arr[i]) && dp[i]<(dp[j]+1)))
                {
                    dp[i] = dp[j]+1;
                    continue;
                }
            }
            maxlength = Math.max(maxlength,dp[i]);
        }
        return maxlength;
    }
    static class compclass implements Comparator<String>
    {
        @Override
        public int compare(String s1,String s2) {
            if (s1.length() < s2.length())
                return -1;//dont swap
            else if (s1.length() == s2.length())
                return 0;
            else
                 return 1;
        }
    }
   // static Comparator<String> comp = (s1, s2) -> s1.length() - s2.length();
    public static void main(String args[])
    {
        String[] arr = {"xbc","pcxbcf","xb","fanu","cxbc","pcxbc"};
        Arrays.sort(arr,new compclass());// object of it
        for(String i: arr)
            System.out.println(i);
        System.out.println(tabulation(arr));

    }
}
