import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class lis_printing {
//we can also count using printing as we have acces to length here
    public static void recursion(int[] arr, int prev, int index, List<Integer> lis, List<Integer> longestLIS) {
        if (index >= arr.length) {/*ek list circulate hogi doosri longest store kregi*/
            // Base case: reached the end of the array
            if (lis.size() > longestLIS.size())
            {
                longestLIS.clear();
                longestLIS.addAll(lis);
            }
            return;//we cant return fronm here as we dont know when does it end
        }

        // Recursive case: try including the current element
        if (prev == -1 || arr[index] > arr[prev])
        {//agar bada hoga toh include karo phir hatao
            lis.add(arr[index]);
            recursion(arr, index, index + 1, lis, longestLIS);
            lis.remove(lis.size() - 1); // Backtrack
        }
        // Recursive case: exclude the current element
        recursion(arr, prev, index + 1, lis, longestLIS);
    }


    public static  int memoization(List <Integer> lis, List<Integer> longestLIS, Integer[][] dp,int[]arr ,int prev,int index) {
        {
            int take = 0;
            int nottake = 0;
            if (index > arr.length - 1) {
                if (lis.size() > longestLIS.size())
                {
                    longestLIS.clear();
                    longestLIS.addAll(lis);
                }
                return 0;
            }
            if (dp[index][prev + 1]!= null)//coordinate shifting
            {
                if (dp[index][prev + 1] + lis.size() > longestLIS.size()) {//we are willing to do that again if greater
                    //as we need that subsequence
                    if (prev == -1 || arr[index] > arr[prev])
                    {
                        lis.add(arr[index]);
                        take += 1 + memoization(lis, longestLIS, dp,arr, index, index + 1);
                        lis.remove(lis.size() - 1);
                    }
                    nottake += 0 + memoization(lis, longestLIS,dp,arr, prev, index + 1);
                    dp[index][prev + 1] = Math.max(take, nottake);
                }
                    return dp[index][prev + 1];
            }
            else
            {
                    if (prev == -1 || arr[index] > arr[prev]) {
                        lis.add(arr[index]);
                        take += 1 + memoization(lis, longestLIS, dp,arr, index, index + 1);
                        lis.remove(lis.size() - 1);
                    }
                    nottake += 0 + memoization(lis, longestLIS, dp,arr, prev, index + 1);
                    dp[index][prev + 1] = Math.max(take, nottake);
                    return dp[index][prev+1];
            }
        }
    }

    public static void tabulation(int[]arr)
    {
        int[] longest = new int[arr.length];
        Arrays.fill(longest,1);
        int[] prev = new int[arr.length];
        for(int i =0;i<=arr.length-1;i++)
            prev[i]=i;
        for(int i =1;i<=arr.length-1;i++)
        {
            for(int j =0;j<i;j++)
            {
                if(arr[j]<arr[i])
                {//kya pata ek bada subsequence pehle hi mil gya ho , par naye se compare kar lo phir bhi
                    if(longest[i]<longest[j]+1)//jo bhi subsequence available tha usme ek jud gya
                    {
                        longest[i] = longest[j]+1;
                        prev[i]= j;
                    }
                }

            }
        }
        int greind=-1;
        int greatest = Integer.MIN_VALUE;
        for(int i =0;i<=arr.length-1;i++)
        {
            if(longest[i]>greatest)
            {
                greatest = longest[i];
                greind = i;
            }
        }
        System.out.println("The greatest subsequence is of length "+greatest+"and is");
                 do{
                    System.out.print(arr[greind]+" ");
                    greind = prev[greind];
                }while(prev[greind]!=greind);
                 System.out.print(arr[greind]);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,4,9};
        List<Integer> lis = new ArrayList<>();
        List<Integer> longestLIS = new ArrayList<>();
        recursion(arr, -1, 0, lis, longestLIS);
        System.out.println("Longest Increasing Subsequence: " + longestLIS);


        List<Integer> lis1 = new ArrayList<>();
        List<Integer> longestLIS1 = new ArrayList<>();
        Integer[][]dp = new Integer[arr.length+1][arr.length+1];
        Arrays.fill(dp[arr.length],0);
        memoization(lis1,longestLIS1,dp,arr,-1,0);
        System.out.println("Longest Increasing Subsequence: "+longestLIS1 );
        System.out.println("Tabulation gives us");
        tabulation(arr);
    }
}
