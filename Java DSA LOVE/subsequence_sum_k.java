public class subsequence_sum_k {
    public static boolean recursion(int k , int[] arr, int index)
        {
            boolean ans = false;
            if(index==0)
                return k==arr[0];
            //for optimization
            if(k==0)
                return true;
            k -= arr[index];
            //one more optimization
            boolean include = false;
            if(k>=arr[index])
                 include = recursion(k-arr[index],arr,index-1);
            boolean exclude = recursion(k,arr,index-1);
            return include||exclude;    //puri branch ka de dia if available or not
        }
    public static boolean memoization(int k , int[] arr, int index,Boolean[][] dp)
    {
        if(k==0)
            return true;
        if(index==0)
            return k==arr[0];
        if (dp[index][k] != null) {
            return dp[index][k];
        }
        boolean include = false;
        if(k>=arr[index])
            include = memoization(k-arr[index],arr,index-1,dp);
        boolean exclude = memoization(k,arr,index-1,dp);
        dp[index][k] = include || exclude;
        return dp[index][k];
    }
    public static boolean tabulation(int[]arr,int target,boolean[][]dp) {
        for (int i = 0; i < arr.length; i++)
            dp[i][0] = true;
        if (arr[0] <= target) {
            dp[0][arr[0]] = true;
        }
            for (int index = 1; index < arr.length; index++)
            {
                for (int ttarget = 1; ttarget <= target; ttarget++)
                {
                    if (dp[index - 1][ttarget] == true)//if we dont take current
                        dp[index][ttarget] = true;
                    else
                    {//if we want to take current
                        if (ttarget - arr[index] < 0)
                            dp[index][ttarget] = false;
                        else
                            dp[index][ttarget] = dp[index - 1][ttarget - arr[index]];
                    }
                }
            }
        return dp[arr.length - 1][target];


    }
        public static void main(String args[])
        {
            int[] arr = new int[]{4,2,5,6,7};
            int k = 14;
            long time1;
            long time2;
            time1 = System.currentTimeMillis();
            System.out.println(recursion(k,arr,4));
            time2 = System.currentTimeMillis();
            System.out.println("Time taken by recursion function is : "+(time2-time1));

            Boolean[][] dp = new Boolean[arr.length][k + 1];
            time1 = System.currentTimeMillis();
            System.out.println(memoization(k,arr,4,dp));
            time2 = System.currentTimeMillis();
            System.out.println("Time taken by memoization function is : "+(time2-time1));


            time1 = System.currentTimeMillis();
            boolean[][] dp1 = new boolean[arr.length][k+1];

            System.out.println(tabulation(arr,k,dp1));
            time2 = System.currentTimeMillis();
            System.out.println("Time taken by memoization function is : "+(time2-time1));
        }
    }
