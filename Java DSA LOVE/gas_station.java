public class gas_station
{
    public static int numberOfGasStationsRequired(double dist, int[] arr) {
       int n = arr.length; // size of the array
       int cnt = 0;
       for (int i = 1; i < n; i++) {
           int numberInBetween = (int)((arr[i] - arr[i - 1]) / dist);
           if (((arr[i] - arr[i - 1]) % dist) ==0 ) {
               numberInBetween--;
           }
           cnt += numberInBetween;
       }//as ex we might have = 0.8 gapp and 0.4 as wanted distance 
               //then dividing them we get  = 2 but we have actually space for 1 only had it been a little
               // greater then the answer would be 2;
            
       return cnt;
    }

public static double MinimiseMaxDistance(int []arr, int k)
{
    int n = arr.length; // size of the array
    double low = 0;
    double high = 0;
    //Find the maximum distance:
    for (int i = 0; i < n - 1; i++) {
        high = Math.max(high, (double)(arr[i + 1] - arr[i]));
    }
    //Apply Binary search:
    double diff = 1e-6 ;
    double answer =high;//as initally we have max distance as our answer; till we reduce it
    //hamesha jyada plac0e kar pa rha hu that basically means number of stations are less than number of equal partitions;
    while (high >= low) {
        double mid = (low + high) / (2.0);
        int cnt = numberOfGasStationsRequired(mid, arr);
        if (cnt <= k) {
            answer = mid;
            high =mid-diff;
        } else {
            low = mid+diff;
        }
    }
    return answer;
}

public static void main(String[] args)
{
     int[] arr = new int[]{4,6,10};
     double answer = MinimiseMaxDistance(arr,4);
     System.out.println(answer);
}
}
