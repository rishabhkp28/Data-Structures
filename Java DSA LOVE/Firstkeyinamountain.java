class Firstkeyinamountain
{
    public static int findInMountainArray(int key,int[] mountainArr)
    {
        int start = 0,end = mountainArr.length-1;
        int mid = 0;
        while(start!=end)
        {
            mid = (start+end)/2;
            if(mountainArr[mid]>mountainArr[mid+1])
            end=mid;
            else
            start = mid+1;
        }
        start = 0; int answer = -1;
        int peak = end;
        while(start<=end)
        {
            mid = (start+end)/2;
            if(mountainArr[mid]>key)
            {
                end= mid-1;
            }
            else if(mountainArr[mid]<key)
            {
                start= mid+1;
            }
            else
            {
                answer = mid;
                break;
            }
        }
        if(answer == -1)
        {
            start =peak+1 ;end = mountainArr.length-1;
            while(start<=end)
            {
                mid = (start+end)/2;
                if(mountainArr[mid]<key)
                {
                    end= mid-1;
                }
                else if(mountainArr[mid]>key)
                {
                    start= mid+1;
                }
                else
                return mid ;               
            }
            return answer;
        }
        else
        return answer;    
    }

    public static void main(String args[])
    {
        int ab =  findInMountainArray(1, new int[]{0,5,3,1});
        System.out.println(ab);
    }
}