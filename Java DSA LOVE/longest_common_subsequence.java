import java.util.*;
public class longest_common_subsequence {
    public static int recursion(String s1,String s2,int index1,int index2) {
        /*
        Every recursive call tells me "Hey these are the indexes from where you have to give me the length of longest common subsequence and

        */
        int length = 0;
        if (index1 == -1 || index2 == -1)
            return 0;
        else if (s1.charAt(index1) == s2.charAt(index2))
            length += 1 + recursion(s1, s2, index1 - 1, index2 - 1);
        else
            length += 0 + Math.max(recursion(s1, s2, index1 - 1, index2), recursion(s1, s2, index1, index2 - 1));
        //jo pehle match hua uskoh le hi lo
        return length;
    }
    public static int memoization(String s1,String s2,int index1,int index2,Integer[][]dp)
    {
        int length = 0;
        if (index1 == -1 || index2 == -1)
            return 0;
        if(dp[index1+1][index2+1] != null)
            return dp[index1+1][index2+1];

        if (s1.charAt(index1) == s2.charAt(index2))
            length += 1 + memoization(s1, s2, index1 - 1, index2 - 1,dp);
        else
            length += Math.max(memoization(s1, s2, index1 - 1, index2,dp), memoization(s1, s2, index1, index2 - 1,dp));

        dp[index1+1][index2+1] = length;
        return length;
    }
    public static int tabulation(String s1,String s2,int[][]dp) {
        for (int i = 0; i <= s1.length() - 1; i++) {
            for (int j = 0; j <= s2.length() - 1; j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    /*In recursion if the index was found to be equal then we incremented both of the pointers*/

                    dp[i+1][j+1] = 1 + dp[i][j];
                } else {
                    /*In recursion if we were getting some unequal characters we used to either decrement the first pointer or the second
                     pointer and then find the max value among it*/

                    dp[i+1][j+1] = Math.max(dp[i][j+1], dp[i+1][j]);
                }

            }
            //We can furthur space optimize it by storing only the previous row
        }
        return dp[s1.length()][s2.length()];

    }
    public static int optimizedTabulation(String s1,String s2)
    {
        int[] prev = new int[s2.length()+1];
        int[] current = new int[s2.length()+1];
        for (int i = 0; i <= s1.length() - 1; i++) {
            for (int j = 0; j <= s2.length() - 1; j++) {

                if(s1.charAt(i)==s2.charAt(j))
                {
                      current[j+1] = 1+ prev[j];
                }
                else
                    current[j+1] = Math.max(current[j],prev[j+1]);

            }
            prev= current.clone();
        }
        return current[s2.length()];

    }
    public static void main(String args[])
    {
        String s1 = "bbbaaaba";
        String s2 = "bbababbb";
        System.out.println("LCS length : "+recursion(s1,s2,s1.length()-1,s2.length()-1));

        Integer[][] dp = new Integer[s1.length()+1][s2.length()+1];//coordinate shifting
        System.out.println("LCS by memoization "+memoization(s1,s2,s1.length()-1,s2.length()-1,dp));
        int[][] dp1 = new int[s1.length()+1][s2.length()+1];
        System.out.println("Result by tabulation is : "+tabulation(s1,s2,dp1));
        System.out.println("Result by tabulation optimized is : "+optimizedTabulation(s1,s2));



    }
}
