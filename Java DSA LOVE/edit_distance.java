import java.util.*;
public class edit_distance {
    public static int recursion(String s1 ,String target,int index1,int index2)
    {
        /*Every recursive call tells me that hey this is the index1 of string 1 from where you have
        to tell me the number of operations needed to convert it to the targest */
        int steps = Integer.MAX_VALUE;
        int stepsinsert =Integer.MAX_VALUE;
        int stepsdelete =Integer.MAX_VALUE;
        int stepsreplace =Integer.MAX_VALUE;
       //base conditions
       if(index2==-1)
           return index1+1;//steps for deletion
       else if(index1==-1)
           return index2+1;//steps needed for insertion

        if(s1.charAt(index1)== target.charAt(index2))
            steps = 0 + recursion(s1,target,index1-1,index2-1);
        else
        {
            stepsinsert = 1 + recursion(s1, target, index1, index2 - 1) ;//because we inserted the current character of source;
            stepsdelete = 1 + recursion(s1, target, index1 - 1, index2);
            stepsreplace = 1 + recursion(s1, target, index1 - 1, index2 - 1);
            //we had three choices to do just because we had this replace option otherwise we would
            // go for lcs;
            }
        return Math.min(steps,Math.min(stepsinsert,Math.min(stepsdelete,stepsreplace)));
    }
    public static int memoization(String s1,String target,int index1,int index2,Integer[][]dp)
    {
        int steps = Integer.MAX_VALUE;
        int stepsinsert =Integer.MAX_VALUE;
        int stepsdelete =Integer.MAX_VALUE;
        int stepsreplace =Integer.MAX_VALUE;
        //base conditions
        if(index2==-1)
            return index1+1;//steps for deletion
        else if(index1==-1)
            return index2+1;//steps needed for insertion

        if(dp[index1+1][index2+1]!=null)
            return dp[index1+1][index2+1];

        if(s1.charAt(index1)== target.charAt(index2))
            steps = 0 + memoization(s1,target,index1-1,index2-1,dp);
        else
        {
              stepsinsert = 1 + memoization(s1, target, index1, index2 - 1,dp);//because we inserted the current character of source;
              stepsdelete = 1 + memoization(s1, target, index1 - 1, index2,dp);
              stepsreplace = 1 + memoization(s1, target, index1 - 1, index2 - 1,dp);
              //we had three choices to do just because we had this replace option otherwise we would
              // go for lcs;
        }
        dp[index1+1][index2+1] = Math.min(steps,Math.min(stepsinsert,Math.min(stepsdelete,stepsreplace)));

        return dp[index1+1][index2+1];
    }
    public static int tabulation(String source,String target,int[][]dp)
    {
        for(int i = 0;i<=source.length()-1;i++)
        {
            for(int j = 0;j<=target.length()-1;j++)
            {
                if(source.charAt(i)== target.charAt(j))
                    dp[i+1][j+1]= dp[i][j];
                else
                {
                    dp[i+1][j+1] =  Math.min(Math.min(dp[i][j]+1,1+dp[i][j+1]),dp[i+1][j]+1);
                }

            }
        }
        return dp[source.length()][target.length()];
    }
    public static void main(String args[])
    {
        String s1 = "execution";
        String s2 = "intention";
        System.out.println(recursion(s1,s2,s1.length()-1,s2.length()-1));
        Integer[][] dp1 = new Integer[s1.length()+1][s2.length()+1];
        System.out.println("Memoization gives : "+memoization(s1,s2,s1.length()-1,s2.length()-1,dp1));

        //source on vertical and target on horizontal
        int[][] dp = new int[s1.length()+1][s2.length()+1];

        for(int i =0;i<=dp[0].length-1;i++)
        {
            dp[0][i] = i;
        }
        for(int i =1;i<=dp.length-1;i++)
        {
            dp[i][0] = i;
        }
        System.out.println("Tabulation gives : "+tabulation(s1,s2,dp));
    }
}
