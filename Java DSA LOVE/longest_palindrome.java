public class longest_palindrome {
    public static String longestPalindrome(String s)
    {
        String answer = s.substring(0,1);
        String pal    = s.substring(0,1);
        for(int i =0;i<=s.length()-1;i++)
        {
            int left = i-1;
            int right=i+1;
            //performing odd length
            while(left>-1 && right<s.length())
            {
                if(s.charAt(left)==s.charAt(right))
                    pal=s.substring(left,right+1);
                else
                    break;
                --left;
                ++right;
            }
            if(pal.length()>answer.length())
                answer =pal;
            left=i;
            right=i+1;
            //performing even length;
            while( left>-1 && right< s.length())
            {
                if(s.charAt(left)==s.charAt(right))
                    pal=s.substring(left,right+1);
                else
                    break;
                --left;
                ++right;
            }
            if(pal.length()>answer.length())
                answer= pal;
        }

        return answer;
    }
    public static void main(String[] args)
    {
        System.out.println(longestPalindrome("ababbababab"));

    }

}
