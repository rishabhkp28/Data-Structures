public class dp_longest_palindrome
{
    /* we need to find the length of the longest common palindrome in the string one and string two , second
    string is the reverse of the first string*/
    public static int tabulation(String s1,String s2,int[][]dp) {
        for (int i = 0; i <= s1.length() - 1; i++) {
            for (int j = 0; j <= s2.length() - 1; j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    /*In recursion if the index was found to be equal then we incremented both of the pointers*/
                    dp[i+1][j+1] = 1 + dp[i][j];
                } else {

                    dp[i+1][j+1] = Math.max(dp[i][j+1], dp[i+1][j]);
                }

            }
        }
        return dp[s1.length()][s2.length()];

    }
    public static void main(String[] args)
    {
        String s1 = "abcbad";
        StringBuffer s2 = new StringBuffer(s1);
        s2 =  s2.reverse();
        int[][] dp1 = new int[s1.length()+1][s2.length()+1];
        System.out.println("Length of the longest common palindrome is "+tabulation(s1,s2.toString(),dp1));

    }
}
