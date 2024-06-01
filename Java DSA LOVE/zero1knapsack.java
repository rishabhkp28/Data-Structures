import java.util.*;
public class zero1knapsack {
    public static int recursion(int []weights,int values[],int capacity,int index)
    {
        int takesum = 0, nottakesum = 0;
        if (index == -1|| capacity==0) {
            return 0;
        }
        if (weights[index] <= capacity)
            takesum += values[index] + recursion(weights,values, capacity - weights[index], index - 1);

        nottakesum += recursion(weights,values, capacity, index - 1);

        return Math.max(takesum, nottakesum);

    }
    public static int memoization(int []weights,int values[],int capacity,int index,Integer[][]dp)
    {
        int takesum = 0, nottakesum = 0;
        if (index == -1|| capacity==0) {
            return 0;
        }
        if(dp[index][capacity]!=null)
            //ho sakta hai same index par kisi aur ki same capacity bachi ho
            return dp[index][capacity];
        if (weights[index] <= capacity)
            takesum += values[index] + memoization(weights,values,capacity-weights[index],index-1,dp);

        nottakesum += memoization(weights,values, capacity, index - 1,dp);

        dp[index][capacity] =(int) Math.max(takesum,nottakesum);//is capacity par max vaue kitni nikli;
        return dp[index][capacity];

    }
    public static Integer tabulation(int[] weights,int[] values,int capacity) {
        //we know ki harr recursion call par vo max value return krega usse peeche tak jo
        //possible hoti ho this will be used for ever table filling in tabulatoin+
        //if i am at any index and capacity is 0 then profit will be 0 for that case;
        Integer[][] dp = new Integer[values.length][capacity+1];

        for (int index = 0; index <= values.length-1; index++)
            dp[index][0] = 0;

        //also we know ki agar 0 index available hai jo vohi max value hai ;
        int price = 0;
        if (weights[0] <= capacity)
            dp[0][weights[0]] = values[0];

        for(int i =0;i<=capacity;i++)
        {
             if(i>weights[0])
                dp[0][i]= values[0];
             else if(i<weights[0])
                 dp[0][i] = 0;

        }


        for (int index = 1; index <= values.length - 1; index++) {
            for (int tempcap = 1; tempcap <= capacity; tempcap++) {
                if (tempcap >= weights[index])
                    dp[index][tempcap] = Math.max(dp[index - 1][tempcap], values[index] + dp[index - 1][tempcap - weights[index]]);
                else
                    dp[index][tempcap] = dp[index - 1][tempcap];

            }
        }
        return dp[values.length-1][capacity];
    }
    public static void main(String args[])
    {
        int weights[] = new int[]{6, 5, 1, 5, 6, 5, 9};
        int values[] = new int[]{5 ,3 ,4 ,9, 6 ,1 ,1};
        int capacity = 63;
        long time1;
        long time2;
//        time1 = System.currentTimeMillis();
//        System.out.println(recursion(weights,values,capacity,values.length-1));
//        time2 = System.currentTimeMillis();
//        System.out.println("Time taken for recursion is "+(time2-time1));
        //recursion says time limit exceeded;
        Integer[][] dp = new Integer[values.length][capacity+1];

        time1 = System.currentTimeMillis();
        System.out.println(memoization(weights,values,capacity,values.length-1,dp));
        time2 = System.currentTimeMillis();
        System.out.println("Time taken for memoization is "+(time2-time1));

        time1 = System.currentTimeMillis();
        System.out.println(tabulation(weights,values,capacity));
        time2 = System.currentTimeMillis();
        System.out.println("Time taken for tabulation is "+(time2-time1));
    }
}
