public class recatoi {
    /*extracts integer from string , the can be after spaces or a single space and + or space and -but not after
    other characters , and then extract it to where it si present
     */
    public static int recursion(String s,int start ,int end,int flag) {
        if(start==s.length()) {
            return 0;
        }
        if(end == s.length())
        {
            try{
                return flag * Integer.parseInt(s.substring(start,end));
            }
            catch(Exception e)
            {
                return flag==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
        }
        else if(s.charAt(end)=='0'||s.charAt(end)=='1'||s.charAt(end)=='2'||
                s.charAt(end)=='3'||s.charAt(end)=='4'||s.charAt(end)=='5'||s.charAt(end)=='6'
                ||s.charAt(end)=='7'||s.charAt(end)=='8'||s.charAt(end)=='9') {
             return recursion(s, start, ++end,flag);
        }
        else {

            try{
                return flag*Integer.parseInt(s.substring(start,end));
            }
            catch(Exception e)
            {
                return flag == 1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }

        }

    }
    public static int myAtoi(String s) {
        s= s.trim();
        int flag=0;
        String ans="";
        int i =0;
        char ch =' ';

        for(i=0;i<=s.length()-1;i++)
        {
            ch = s.charAt(i);
            if(ch=='-' )
            {
                flag=-1;
                ++i;
                break;
            }
            else if(ch=='+')
            {
                flag=1;
                ++i;
                break;
            }
            else if(ch=='0'||ch=='1'||ch=='2'||
                    ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9')
            {
                flag =1;
                break;
            }
            else
                return 0;
             }
        //ab mere pass jo bacha hai vo ya toh space, ya toh digit ya toh charater hoga ya end;
        return recursion(s,i,i,flag);
    }
    public static void main(String args[])
        {
            System.out.println(myAtoi("-8746787897877"));
        }


}
