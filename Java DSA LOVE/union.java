import java.util.*;
public class union
{
    public static void main(String args[])
    {
        union obj = new union();
        int nums1[] = new int[]{1,4,5,15,20,21,27};
        int nums2[] = new int[]{3,4,4,15,21,27};
        ArrayList<Integer> al = new ArrayList<Integer>();
        al= obj.combine_without_duplicate(nums1,nums2);
        Iterator<Integer> itr = al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
    public ArrayList<Integer> combine_without_duplicate(int[]nums1,int[]nums2)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int ptr1 = 0;//for reference in the first list;
        int ptr2 = 0;//for reference in the second list;
        while(ptr1<nums1.length && ptr2<nums2.length )
        {

            // if(nums1[ptr1]==nums2[ptr2])
            // {
            //     al.add(nums1[ptr1]);
            //     ++ptr1;
            //     ++ptr2;
            //     ++temp;as this is not checking for whether the numberis already added to the array list

            // }
            if(nums1[ptr1]<nums2[ptr2])
            {
                if(al.size()==0 || nums1[ptr1]!= al.get(al.size()-1))
                {
                    al.add(nums1[ptr1++]); 
                }
                else
                ++ptr1;
            }
            else //if(nums[ptr2]<=nums[ptr1]) this case here
            {
                if(al.size()==0 || nums2[ptr2]!= al.get(al.size()-1))
                {
                    al.add(nums2[ptr2++]);
                    
                }
                else 
                ++ptr2;
            }
        }
        //before doing this we need to be sure that the the element at the end of array list must not match with the element to where the pointer is pointing initially
        if(ptr1==nums1.length)
        {
            for(;ptr2!=nums1.length;ptr2++)
            {
                if(nums2[ptr2]==al.get(al.size()-1))
                continue;
                else
                al.add(nums2[ptr2]);
            }
        }
        else
        {
            for(;ptr1!=nums2.length;ptr1++)
            {
                if(nums2[ptr1]==al.get(al.size()-1))
                continue;
                else
                al.add(nums2[ptr1]);
            }

        }
        return al;
    }
}