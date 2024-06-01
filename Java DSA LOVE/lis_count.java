import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
/*
This program does all three , print lis, length of lis and count total lis
*/
public class lis_count {
    //intuition , what if i store the count in the wrapper class
    public static void recursion(int[] arr, int prev, int index, List<Integer> lis, List<Integer> longestLIS,int[] count) {
        if (index >= arr.length) {/*ek list circulate hogi doosri longest store kregi*/
            // Base case: reached the end of the array
            if (lis.size() > longestLIS.size())
            {
                count[0]=1;
                longestLIS.clear();
                longestLIS.addAll(lis);
            }
            else if(lis.size()==longestLIS.size())
            {
                ++count[0];
            }
            return;//we cant return fronm here as we dont know when does it end
        }

        // Recursive case: try including the current element
        if (prev == -1 || arr[index] > arr[prev])
        {//agar bada hoga toh include karo phir hatao
            lis.add(arr[index]);
            recursion(arr, index, index + 1, lis, longestLIS,count);
            lis.remove(lis.size() - 1); // Backtrack
        }
        // Recursive case: exclude the current element
        recursion(arr, prev, index + 1, lis, longestLIS,count);
    }
    /*for tabulation it would require two tables, one to store the longest subsequence length achieved from index
    considering prev index and also how many can be achieved*/
    public static void tabulation(int[]arr) { //printing tabulation doesnt give me count till at
        // a particular index,it just tells me the longest subsequence that ends with a particular index
        //it can we one two or many
        int[] longest = new int[arr.length];
        Arrays.fill(longest, 1);
        int[] count = new int[arr.length];
        Arrays.fill(count, 1);
        int repeater = 1;
        for (int i = 1; i <= arr.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i])
                {
                    if (longest[i] < (longest[j] + 1))
                    {   //as longest changed
                        longest[i] = longest[j] + 1;
                            count[i] = count[j];
                    }
                    else if (longest[i] == (longest[j] + 1))//this will never equate to 1
                    {
                        count[i] += count[j];
                    }
                }

            }
        }
        int greind = -1;
        int greatest = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (longest[i] > greatest) {
                greatest = longest[i];
                greind = i;
            }
        }
        int counter=0;
        for(int i =0;i<=arr.length-1;i++)
        {
            if(longest[i]==greatest)
                counter+=count[i];
        }
        System.out.println("LIS are equal to " + counter);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,4,7};
        int[] count = new int[1];
        List<Integer> lis = new ArrayList<>();
        List<Integer> longestLIS = new ArrayList<>();
        recursion(arr, -1, 0, lis, longestLIS,count);
        System.out.println("Longest Increasing Subsequence: " + longestLIS);
        System.out.println("Count value is "+count[0]);
        System.out.println("Tabulation gives us");
        tabulation(arr);
    }
}
