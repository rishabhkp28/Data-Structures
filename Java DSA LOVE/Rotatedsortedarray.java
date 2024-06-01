//pivot find (last element) in rotated sorted array
class Rotatedsortedarray {
    public static int search(int[] nums) {
        int start = 0 ;
        int end = nums.length -1;
        int index=-1;
        if(start==end)//single element present
            index=1;
        else if(nums[start]<nums[end])//no rotation done
        index = -1;
        else
        while(start<end)
        {
            int  mid =( start + end)/2;
            if(nums[mid]>nums[start])//end element dhoondna hai
            start = mid;
            else if(nums[mid]>nums[mid+1])
            {
                index = mid;
                break;
            }
            else if(nums[mid-1]>nums[mid])
            {
                index = mid-1;
                break;
            }
            else 
            end=end-1;
        }
        return index;
    }
        public static void main(String args[])
        {
            int answer = search(new int[]{4,7,9,1,3,7,9,10});
            System.out.println(answer);

        }
    }
