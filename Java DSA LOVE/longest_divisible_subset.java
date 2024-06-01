import java.util.*;
public class longest_divisible_subset {
    public static void recursion(List<Integer> temp,List<Integer> longest,int[]arr,int index, int prev)
    {
        //find the longest divisible subsequence from index
        if(index == arr.length) {
            if (temp.size() > longest.size())
            {
                //last me pahuch gaye aur temp ka size longest se bada hai toh lelo longest me
                longest.clear();
                longest.addAll(temp);
            }
            return;
        }
            if(  prev == -1 || (arr[index] % temp.get(temp.size()-1))==0) {
                temp.add(arr[index]);
                recursion(temp,longest,arr, index+1,index);
                temp.remove(temp.size()-1);
            }

            //now backtracking pichli state par pahuch gaye
            recursion(temp,longest,arr,index+1,prev);

    }
    public static  int memoization(List<Integer> temp,List<Integer> longest,int[]arr,int index,int prev,Integer[][]dp)
    {
        int take =0;
        int nottake = 0;
        //find the longest divisible subsequence from index
        if(index == arr.length) {
            if (temp.size() > longest.size())
            {
                //last me pahuch gaye aur temp ka size longest se bada hai toh lelo longest me
                longest.clear();
                longest.addAll(temp);
                return temp.size();
            }
            return temp.size();
        }
        if(dp[index][prev+1]!=null) // coordinate shifting
        {
            if((dp[index][prev+1]+temp.size())<=longest.size())//can compute again
                return dp[index][prev+1];
        }

            if (prev == -1 || (arr[index] % temp.get(temp.size() - 1)) == 0)
            {
                temp.add(arr[index]);
                take += 1 + memoization(temp, longest, arr, index + 1, index, dp);
                temp.remove(temp.size() - 1);
            }

            //now backtracking pichli state par pahuch gaye
            nottake = 0 + memoization(temp, longest, arr, index + 1, prev, dp);

            dp[index][prev+1] = Math.max(nottake,take);
            return dp[index][prev+1];
    }
    public static void tabulation(int[] arr)
    {
        int[]longest = new int[arr.length];
        int[] prev = new int[arr.length];
        Arrays.fill(longest,1);
        for(int i =0;i<=arr.length-1;i++)//we need this so as to find the sequence and end the loop
            prev[i]=i;
        int maxlong =0;
        int index=-1;
        for(int i =1;i<=arr.length-1;i++) {
            for (int j = 0; j < i; j++) {
                if (longest[j] + 1 > longest[i] &&arr[i]%arr[j]==0) {
                    longest[i] = longest[j] + 1;
                    prev[i] = j;

                }

            }
            if (longest[i] > maxlong) {
                maxlong = longest[i];
                index = i;
            }
        }

        List <Integer> temp = new ArrayList<>();
        int i = index;
        while(i!=prev[i]) {
            temp.add(arr[i]);
            i=prev[i];
        }
            temp.add(arr[i]);
        Collections.reverse(temp);
        System.out.println(temp);
    }
    public static void main(String args[])
    {
        int[] arr = new int[]{1,4,7,8,13};
        List <Integer> temp = new ArrayList<>();
        List <Integer> longest = new ArrayList<>();
        Arrays.sort(arr);
        recursion(temp,longest,arr,0,-1);
        System.out.println(longest);
        Integer[][]dp = new Integer[arr.length][arr.length];
        List <Integer> temp1 = new ArrayList<>();
        List <Integer> longest1 = new ArrayList<>();

        memoization(temp1,longest1,arr,0,-1,dp);
        System.out.println(longest1);
        tabulation(arr);


    }
}
