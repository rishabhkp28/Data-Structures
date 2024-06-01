import java.util.Arrays;
public class distribute_k_for_most_freq
{
        public static int maxFrequency(int[] arr, int k) 
        {
            Arrays.sort(arr);
            int mid = 0,l = 1 ;
            int h = arr.length;
            int answer = arr[0];
            int answerwindow =1;
            while(h >= l)  //means no window was possible
            {   
                int sum=00;
                 mid = l+(h-l)/2; 
                for(int i = 0 ;i<=mid-1;i++)
                {
                sum+=arr[i];
                }
                int left=0;
                for(int right=mid-1;right<arr.length;right++)
                {
                    if(arr[right]*mid-sum>k&& right==arr.length-1)
                    {
                        h=mid-1;//as no mid cases existed

                    }
                    else if(arr[right]*mid-sum>k)//non last case
                    {
                        sum=sum-arr[left++]+arr[right+1];
                    continue;
                    }
                    else 
                    {
                        answer=arr[right];
                        answerwindow=mid;
                        l=mid+1;
                        break;
                    }
                }
                //answer stores the answer and answer array stores the window size(freq)
            }            
        return answerwindow;
        }
    
    public static void main(String args[])
    {
        int arr[] = new int[]{3,9,6,67,7};
        int answer = maxFrequency(arr,2);
        System.out.println(answer);
    }
}