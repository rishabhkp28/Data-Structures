public class sortcharacters
{
        public static String mergesort(String s)
        {
            int mid = (s.length()-1)/2;
            if(s.length()==1)
            return s;
            else
            {
               String s1 = mergesort(s.substring(0,mid+1));
               String s2=  mergesort(s.substring(mid+1,s.length()));
               s = merge(s1,s2);
            }
            return s;
        }
        public static String merge(String s1 ,String s2)
            {
            String temp ="";
            int ptr1=0;
            int ptr2 = 0;
            while(ptr1<s1.length()   &&   ptr2 < s2.length())
            {
                if(s1.charAt(ptr1)<=s2.charAt(ptr2))
                {
                    temp+=s1.charAt(ptr1++);
    
                }
                else 
                {
                    temp+=s2.charAt(ptr2++);
                }
            }
            if(ptr1>s1.length()-1)
            {
                temp+=s2.substring(ptr2);
            }
            else
            {
                            
                temp+=s1.substring(ptr1);
            }
            return temp;
        }
        public static void main(String args[])
        {
            String s ="Aabb";
            
            System.out.println(mergesort(s));
            
        }
    
    
}