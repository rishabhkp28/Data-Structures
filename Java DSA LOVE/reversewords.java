public class reversewords
{
    public static String reverseWords(String s) {
        String answer = "";
        s=s.trim();
        int start = s.length()-1;
        for(int i = s.length()-1; i >= 0; i--)
        {
            if(s.charAt(i) == ' ')
            {
                answer += s.substring(i+1,start+1) + " ";      
                s=(s.substring(0,i)).trim();//for finding the correct valid character
                start=s.length()-1;
                i=start;
            }
        }
        answer += s.substring(0,start+1);
        return answer;
        
    }
    public static void main(String args[])
    {
        System.out.println(reverseWords("a good   example"));
    }
}