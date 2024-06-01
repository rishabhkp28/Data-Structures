public class atoi {
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
                    flag=1;
                    ++i;
                    break;
                }
                else if(ch=='+')
                {
                    flag=0;
                    ++i;
                    break;
                }
                else if(ch=='0'||ch=='1'||ch=='2'||
                        ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9')
                {
                    break;
                }
                else
                    return 0;
            }
            if(i!=s.length())
            {
                ch = s.charAt(i);
                if(ch=='0'||ch=='1'||ch=='2'||
                        ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9')
                {
                    ans+=Character.toString(ch);
                    int start = i+1;
                    int end =i+1;
                    i=i+1;
                    while(i<=s.length()-1)
                    {
                        ch = s.charAt(i);
                        if(ch=='0'||ch=='1'||ch=='2'||
                                ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9')
                            ++end;
                        else
                            break;
                        i++;
                    }
                    ans+=s.substring(start,end);
                    double l = Double.valueOf(ans);
                    if(flag==0)
                    {
                        if(l>Integer.MAX_VALUE)
                            return Integer.MAX_VALUE;
                        else
                        {
                            return (int)(l);
                        }
                    }
                    else
                    {
                        if(l<Integer.MIN_VALUE)
                            return Integer.MIN_VALUE;
                        else
                            return (int)(-1*l);
                    }
                }
                else
                    return 0;
            }
            return 0;

        }

    public static void main(String[] args) {


        System.out.println(myAtoi(""));
    }
    }

