import java.util.*;
public class distinct_subsequences_count {
    //how many subsequeences of second string is equal to first string
    public static void  recursion1(String s1, String s2,int index1,int index2,int[] count)
    {
        if(index1==s1.length())
            ++count[0];
        else if(index2==s2.length())
            return;
        else if(s1.charAt(index1)==s2.charAt(index2))
        {
            recursion1(s1,s2,index1+1,index2+1,count);
            recursion1(s1,s2,index1,1+index2,count);
        }
        else
            recursion1(s1,s2,index1,1+index2,count);
    }
    public static int recursion2(String s1,String s2,int index1,int index2)
    { //as every method is returning somthing it is also possible to memoize the result using dp table
        /*Every recursive call tells me hey this is the index of second string from where you have to find the  number of subsequences
         which is equal to substring starting from index1 of string1 to end of string1 */
        int count =0;
        if(index1==s1.length())
            return 1;
        else if(index2==s2.length())
            return 0;
        else if(s1.charAt(index1)==s2.charAt(index2))
        {
            count += recursion2(s1,s2,index1+1,index2+1) + recursion2(s1,s2,index1,1+index2);
            //as we can either choose the current character or may find it later
        }
        else
            count += recursion2(s1,s2,index1,1+index2);

        return count;
    }

    public static int memoization(String s1,String s2,int index1,int index2,Integer[][]dp)
    {
        int count =0;
        if(index1==s1.length())
            return 1;
        else if(index2==s2.length())
            return 0;

        if(dp[index1][index2] !=null)
            return dp[index1][index2];

        if(s1.charAt(index1)==s2.charAt(index2))
        {
            count += recursion2(s1,s2,index1+1,index2+1) + recursion2(s1,s2,index1,1+index2);
            //as we can either choose the current character or may find it later
        }
        else
            count += recursion2(s1,s2,index1,1+index2);

        dp[index1][index2] = count;
        return count;
    }
        public static int tabulation(String s1,String s2)
    {

        int[][] dp = new int[s1.length()+1][s2.length()+1];
        Arrays.fill(dp[s1.length()],1);//it means all characters of first strings are over so we need to take one as its correct path
        //agar s2 kharam hogya then it means no answer throught the taken path
        for(int i = 0;i<=s1.length()-1;i++)
        {
            dp[i][s2.length()]=0;//not the last as we wont get dp[i-1] [j-1] = 1
        }
        for(int i = s1.length()-1;i >=0; i-- )
        {
            for(int j = s2.length()-1;j >= 0; --j)
            {
                if(s1.charAt(i)==s2.charAt(j))
                dp[i][j] = dp[i+1][j+1] + dp[i][j+1];


                /* rest of the substring from 1 can be found dp[i+1][j+1]times+ if current is not taken ,rest of the substring can be found dp[i][j+1]times)
                else */

                else
                    dp[i][j] = dp[i][j+1];
            }
        }
        return dp[0][0];
    }
    public static void main(String args[])
    {
        String s1 = "rabbit";
        String s2 = "rabbbit";//we need to fing subsequence with common length =3;
        int[] count = new int[1];
        recursion1(s1,s2,0,0,count);
        System.out.println(count[0]);
        System.out.println("Common subsequences through recurison2 is "+recursion2(s1,s2,0,0));

        Integer dp[][]= new Integer[s2.length()+1][s1.length()+1];
        System.out.println("Through memoization the answer is : "+memoization(s1,s2,0,0,dp));

        System.out.println("Through the tabulation approach the answer is : "+tabulation(s1,s2));

    }
}
