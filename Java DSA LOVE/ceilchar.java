class ceilchar {
    public static char nextGreatestLetter(char [] A, char key) {
        int ptr1 = 0;
        int ptr2 = A.length-1;
        int mid=0;
        while(ptr1<=ptr2)
        {
            mid = (ptr1+ptr2)/2;
            if(A[mid]>key)
            {
                ptr2= mid-1;
            }
            else if(A[mid]<key)
            {
                ptr1= mid+1;
            }
            else
            return A[mid];
        }
        if(key>A[A.length-1])
        return '-';
        else
        return A[ptr1];
    }
    public static void main(String args[])
    {
        char ch = nextGreatestLetter(new char[]{'c','f','j'},'c');
        System.out.println(ch);
    }
}