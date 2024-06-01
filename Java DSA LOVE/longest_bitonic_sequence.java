import java.util.*;
public class longest_bitonic_sequence {
    public static int tabulation(int[] arr)
    {
        int[][]dp = new int[2][arr.length];
        Arrays.fill(dp[0],1);
        Arrays.fill(dp[1],1);
        for(int i =1;i< arr.length;i++)
        {
            for(int j =0;j<i;j++)
            {
                if(dp[0][j]+1 > dp[0][i] && arr[i]>arr[j])
                    dp[0][i]= dp[0][j]+1;

                if(dp[1][arr.length-1-j]+1>dp[1][arr.length-1-i] && arr[arr.length-1-i]> arr[arr.length-1-j] )
                    dp[1][arr.length-1-i] = dp[1][arr.length-1-j]+1;
            }
        }
        int max =0;
        for(int i =0;i<=arr.length-1;i++)
        {
            dp[0][i] = dp[0][i]+dp[1][i]-1;
            if(dp[0][i]>max)
                max = dp[0][i];
        }
        return max;
    }
    public static void main(String args[])
    {
        int[] arr = new int[]{1,2,1,2,1};
        System.out.println(tabulation(arr));

    }
}
