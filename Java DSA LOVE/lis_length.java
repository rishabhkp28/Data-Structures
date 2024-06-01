public class lis_length {//this gives me the length
    public static int recursion(int[] arr ,int prev,int index)
    {
        /*every call here tells me that hey this is the prev index and find the longest subsequnce from this index
        considering this prev index , that doesnt necessarily mean that this subsequence to start from index but from any where fur
        thur
         */
        int take=0;
        int nottake =0;
        if(index>arr.length-1)
            return 0;//we cant calculate count here as when we reach end we dont know have acces to length
        if( prev==-1 ||arr[index]>arr[prev])
            take += 1+recursion(arr,index,index+1);
        nottake += 0 + recursion(arr,prev,index+1);

        return Math.max(take,nottake);
    }
    public static int memoization(int[] arr ,int prev,int index,Integer[][] dp)
    {//we are looking for the longes subsequence from that index
        int take=0;
        int nottake =0;
        if(index>arr.length-1)
            return 0;
        if(dp[index][prev+1] != null)//coordinate shifting
            return dp[index][prev+1];
        if( prev==-1 ||arr[index]>arr[prev])
            take += 1 + memoization(arr,index,index+1,dp);
        nottake += 0 + memoization(arr,prev,index+1,dp);

        dp[index][prev+1] = Math.max(take,nottake);
        return dp[index][prev+1];
    }
    public static int tabulation(int[] arr)
    {
        int[][] dp= new int[arr.length+1][arr.length+1];//columns increased due to -1
        /*we made same rows in case of time limit exceeded as base case
        as it will be zero
         */

        for(int index = arr.length-1;index>-1;index--)
        {
            for(int prev = index-1;prev>=-1;--prev )//including index-1
            {//the loops work same as reursion input values(indexes and rest coordinate shift only affects down
                int take =0;
                if(prev==-1||arr[index]>arr[prev]  )
                    take = 1 + dp[index + 1][index + 1];

                int nottake= dp[index+1][prev+1];
                dp[index][prev+1] = Math.max(take,nottake);
            }
        }
        return(dp[0][0]);
    }


    public static void main(String args[])
    {
        //int[] arr = new int[]{1322, 2061, 2373, 734, 329, 4339, 2523, 1151, 3000, 3805, 1970, 4523, 2248, 555, 4215, 4200, 1320, 4568, 522, 536, 2410, 3901, 4748, 1355, 2668, 3359, 2756, 4768, 4361, 2804, 1942, 4734, 570, 4162, 3282, 2637, 3152, 3198, 3424, 497, 866, 1126, 2780, 3328, 2504, 2154, 2297, 4611, 2591, 1158, 1530, 4782, 689, 755, 3949, 3143, 4674, 4191, 1940, 3643, 3370, 4630, 3775, 4499, 4788, 2620, 2980, 732, 2865, 1735, 1863, 2331, 2954, 2663, 691, 3854, 4560, 3292, 1921, 4021, 3753, 1658, 157, 1014, 2439, 1, 2979, 961, 2235, 1528, 639, 3367, 1956, 1903, 3656, 3045, 4875, 4954, 1733, 3437, 4729, 1528, 26, 1092, 3177, 1969, 4760, 464, 765, 1202, 4359, 2117, 3769, 1009, 4754, 905, 199, 1652, 3294, 3654, 93, 4662, 4749, 3438, 2766, 268, 199, 4570, 2024, 1613, 238, 4013, 4482, 3677, 2785, 1063, 1041, 2549, 2998, 2773, 2248, 484, 3228, 2780, 4762, 4031, 4660, 923, 3359, 1326, 4364, 254, 981, 570, 1707, 1845, 3135, 4603, 1718, 1092, 2517, 1427, 4805, 2035, 157, 2535, 2417, 3618, 501, 4884, 1615, 3678, 4806, 3402, 3263, 2899, 4930, 3994, 3512, 1931, 3111, 2107, 1512, 354, 2602, 4052, 2865, 1216, 4102, 2444, 3127, 4387, 3759, 3315, 3786, 1113, 152, 695, 4563, 728, 61, 4695, 505, 3643, 1032, 1431, 346, 2435, 2709, 2451, 3798, 27, 3644, 2655, 4999, 740, 850, 4127, 2102, 1231, 663, 3658, 4090, 4179, 1572, 4237, 256, 2862, 2557, 225, 439, 4708, 4127, 2457, 5000, 1228, 3704, 3060, 2773, 733, 2191, 319, 2663, 3645, 4588, 1567, 363, 3257, 4293, 1670, 696, 2278, 3284, 1364, 3420, 2575, 3733, 3397, 946, 2117, 718, 152, 300, 4220, 611, 4170, 3854, 4875, 416, 2832, 3786, 4087, 4786, 205, 3968, 1892, 4713, 2986, 4, 3945, 4899, 3308, 3441, 357, 657, 4106, 4730, 4759, 4766, 2700, 1420, 3408, 65, 199, 3150, 1523, 4781, 3372, 3493, 934, 4461, 1648, 343, 4552, 2141, 4986, 1589, 4150, 1875, 3462, 1022, 3410, 13, 1559, 1014, 3244, 3713, 4279, 3329, 924, 1979, 3452, 2508, 3677, 1178, 771, 2707, 976, 4366, 4408, 3502, 2954, 1968, 3314, 3142, 10, 301
        //};
        int [] arr = new int[]{5 ,5, 5, 5, 5, 5, 5, 5, 5, 5};
        Integer[][]dp = new Integer[arr.length][arr.length+1];//due to coordinate shifting
        System.out.println(recursion(arr,-1,0));
        System.out.println(memoization(arr,-1,0,dp));
        System.out.println(tabulation(arr));

    }
}
