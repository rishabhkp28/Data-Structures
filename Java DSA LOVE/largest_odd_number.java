//this program returns us the largest integer that is only formed from odd number and is also substring of s
public class largest_odd_number
{
        public static int index(String s,int start)
        {
            for(int i =start;i<s.length();i++)
            {
                if(Character.getNumericValue(s.charAt(i))%2==1)
                return i;
            }
            return -1;
        }
        public static String largestOddNumber(String s) 
        {  
            int start =index(s,0);
            
            if(start==-1)//edge case , else atleat one number odd exist
            return "";
            int end=start;
            int max =0;
            for(int i =start+1;i < s.length() ; i++)
            {
                char ch = s.charAt(i);
                if (Character.getNumericValue(ch)%2==1)
                {
                    ++end;
                }
                else
                {
                    //start points to the start of number and end to end of it
                    String extracted = s.substring(start,end+1);
                    int value = Integer.valueOf(extracted);
                    max = Math.max(value,max);
                    start=index(s,i);
                    if(start==-1)
                    return Integer.toString(max);
                    end =start;
                    i=start;
                }
            }
            max = Math.max(Integer.valueOf(s.substring(start,end+1)),max);
            //this is in case that the odd number in the string didnt end;
        return Integer.toString(max);   
        }
    
    public static void main(String args[])
    {
        System.out.println(largestOddNumber("0"));

    }
}