public class shortest_common_supersequence {
        public static void tabulation(String s1,String s2,int[][]dp) {
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

        }

        public static void main(String args[]) {
            String s1 = "bbbaaaba";
            String s2 = "bbababbb";

            int[][] dp = new int[s1.length()+1][s2.length()+1];

            tabulation(s1,s2,dp);
            int i = s1.length()-1;
            int j = s2.length()-1;
            String answer ="";
            while(i>-1 && j>-1)
            {
                if(s1.charAt(i)==s2.charAt(j))
                {
                    answer += s1.charAt(i);
                    --i;
                    --j;
                }
                else if(dp[i][j+1] >= dp[i+1][j])
                {
                    answer += s1.charAt(i);
                    --i;
                }
                else
                {
                    answer += s2.charAt(j);
                    --j;
                }
            }
            if(i==-1)
            {
                while(j>-1)
                {
                    answer+= s2.charAt(j); --j;
                }
            }
            else
            {
                while(i > -1)
                {
                    answer+= s1.charAt(i);
                    --i;
                }

            }

            System.out.println(new StringBuffer(answer).reverse().toString());
        }
    }


