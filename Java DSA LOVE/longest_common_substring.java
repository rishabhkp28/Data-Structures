import java.util.*;

public class longest_common_substring
{
        public static int tabulation(String s1,String s2) {
            int maxlength = 0;
            int[][] dp = new int[s1.length() + 1][s2.length() + 1];
            for (int i = 0; i <= s1.length() - 1; i++) {
                for (int j = 0; j <= s2.length() - 1; j++) {
                    if (s1.charAt(i) == s2.charAt(j)) {
                        dp[i + 1][j + 1] = dp[i][j] + 1;
                    } else
                        dp[i + 1][j + 1] = 0;

                    maxlength = Math.max(dp[i + 1][j + 1], maxlength);
                }

            }
            return maxlength;
        }

        public static void main(String args[])
        {
            String s1 = "a";
            String s2 = "";
            System.out.println("LCS length : "+tabulation(s1,s2));

        }
    }


