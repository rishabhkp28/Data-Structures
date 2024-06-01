import java.util.Arrays;
public class partition_equal_subset_sum {
    public static int recursion(int[]arr, int capacity,int index) {
    int takesum = 0, nottakesum = 0;
        if (index == -1) {
        return 0;
    }
        if (capacity == 0)
            return 0;
        if (arr[index] <= capacity)
    takesum += arr[index] + recursion(arr, capacity - arr[index], index - 1);

    nottakesum += recursion(arr, capacity, index - 1);

        return Math.max(takesum, nottakesum);
}
    public static boolean memoization(int[] arr,int target,int index,Boolean []dp[])
    {/*every method just tells us whether we will be able to get that target
        after taking elements from 0 to that index*/
        boolean take = false;
        boolean nottake = false;

        if(target==0)
            return true;
        else if(index==-1)
            return false;

        if(dp[index][target] != null)
            return dp[index][target];

        if(target>=arr[index])
            take = memoization(arr,target-arr[index],index-1,dp);

        nottake = memoization(arr,target,index-1,dp);

        dp[index][target]= take||nottake;
        return take||nottake;
    }
    public static boolean tabulation(int[]arr,int target,Boolean[][]dp) {
        for (int i = 0; i < arr.length; i++)
            dp[i][0] = true;
        Arrays.fill(dp[0],false);
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
    public static int[] can(int[] arr)
    {
        int sum=0;
        int[] bb = new int[2];
        for(int i=0;i<=arr.length-1;i++)
        {
            sum += arr[i];
        }
        if(sum%2==0) {
            bb[0]=1;
            bb[1]= sum/2;
            return bb;
        }
        return bb;

    }
    public static void main(String args[])
    {
        int[] arr1 = new int[]{1,3,2,8,4};


        int[] arr = can(arr1);
        if(arr[0]==1)
        {
            System.out.println(recursion(arr,arr[1],arr1.length-1));
            Boolean[][] dp = new Boolean[arr1.length][arr[1]+1];
            System.out.println(memoization(arr1,arr[1],arr1.length-1,dp));

            System.out.println(tabulation(arr1,arr[1],dp));
        }
        else
            System.out.println(false);
    }
}
