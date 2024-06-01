import java.util.Arrays;
public class partion_unequal_subset_minimize {
    //works on only positive numbers
        public static int recursion(int[] arr,int target,int index)
        {//every function returns the max it can have from 0 to that index
            int take =0;
            int nottake=0;
            if(target==0||index==-1)
                return 0;

            if(target>=arr[index])
                take = arr[index]+ recursion(arr,target-arr[index],index-1);
            nottake = recursion(arr,target,index-1);
            return Math.max(take,nottake);
        }
        public static int memoization(int[] arr,int target,int index,Integer []dp[])
        {
            int take = 0;
            int nottake = 0;

            if(target==0||index==-1)
                return 0;
            if(dp[index][target] != null)
                return dp[index][target];

            if(target>=arr[index])
                take = arr[index]+memoization(arr,target-arr[index],index-1,dp);

            nottake = memoization(arr,target,index-1,dp);

            dp[index][target]= Math.max(take,nottake);
            return dp[index][target];
        }
        public static int tabulation(int[]arr,int target) {
            int dp[][] = new int[arr.length][target+1];
            for (int i = 0; i < arr.length; i++)
                dp[i][0] = 0;
            for(int i =arr[0];i<=target;i++){
                    dp[0][i]= arr[0];
            }
            for (int index = 1; index < arr.length; index++)
            {
                for (int ttarget = 1; ttarget <= target; ttarget++)
                {
                    if(ttarget>=arr[index])/*means is capacity par current weight liya ja sakta hai so baki bachi hui
                    capacity me best weight kya le ja skte hai*/
                    dp[index][ttarget]=Math.max(dp[index-1][ttarget],arr[index]+ dp[index-1][ttarget - arr[index]]);
                    else
                    dp[index][ttarget]  = dp[index-1][ttarget];
                }
            }
            return dp[arr.length -1][target];
        }

        public static void main(String args[])
        {
            //we will try to get the smaller number
            int[] arr = new int[]{1,3,2,8,4,1};
            int sum=0;
            for(int i=0;i<=arr.length-1;i++)
                sum += arr[i];

            int target = sum/2;
            System.out.println(sum-2*recursion(arr,target,arr.length-1));
            Integer[][] dp = new Integer[arr.length][target+1];
            System.out.println(sum-2*memoization(arr,target,arr.length-1,dp));
            System.out.println(sum-2*tabulation(arr,target));

        }
    }


