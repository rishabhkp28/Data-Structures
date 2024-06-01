import java.util.*;
public class Book_allocation 
{
    public static int count(ArrayList<Integer> arr,int pagelimit)
    {
        int sum=0;
        int students=0;//keeping it 0 affects us at last
        for(int i=0 ;i<arr.size() ;i++)
        {
            sum += arr.get(i);
            if(sum>pagelimit)
            {
                sum=0;
                --i;
                ++students;
            }
            //if sum is less than age limit nothing happens
        }
        return students+1;
    }

    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        if(n<m)
        return -1;
        
        int mid;
        int current_students=0;
        int ul=0;
        int ll = Integer.MIN_VALUE;
        for(int i=0 ;i<arr.size();i++)
        {
            ll = Math.max(arr.get(i),ll);
            ul += arr.get(i);
        }
        int answer =0;
        while(ll<=ul)
        {
            mid = ll+(ul-ll)/2;
            current_students = count(arr,mid);
            if(current_students<=m)
            {
                answer = mid;
                ul= mid-1; 
            }
            else
                ll = mid+1; 
        }
        return answer;
    }
    public static void main(String args[])
    {
        ArrayList<Integer> al = new ArrayList<Integer>(List.of(1, 17, 14 ,9 ,15 ,9 ,14));
        int n = 7; 
        int m =7;
        System.out.println(findPages(al,n,m));
    }
}