public class zero_one_knapsack_sub {
    /*we have certain items with some weight, and we need to find the max
    weight we can have in our bag if the bag has certain capacity*/
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
    public static void main(String args[])
    {
        int[] arr = new int[]{6,3,5,3,6};
        System.out.println(recursion(arr,10,4));

    }
}

