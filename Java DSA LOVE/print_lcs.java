public class print_lcs {
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
    public static StringBuilder data(int[][]dp,String s1,String s2)
    {
        int i = s1.length()-1;
        int j = s2.length()-1;
        StringBuilder str = new StringBuilder();

        while(i > -1 && j > -1 )
        {
            if(s1.charAt(i)==s2.charAt(j))
            {
                str.insert(0,s1.charAt(i));
                --i;
                --j;
            }

            else
            {
                    if (dp[i][j+1] >= dp[i+1][j])//jaha tum khade ho co i+1 aur j+1 hai
                        --i;
                    else
                        --j;
            }

        }
        return str;
    }
    public static void main(String args[])
    {
        String s1 = "prstqw";
        String s2 = "rtqw";
        int[][] dp1 = new int[s1.length()+1][s2.length()+1];
        System.out.println("Result by tabulation is : "+tabulation(s1,s2,dp1));
        StringBuilder str = data(dp1,s1,s2);
        System.out.println(str);
    }
}
