import java.util.*;
public class infixtopostfix {

    public static int priority(char ch)
    {
        if(ch=='^')
            return 3;
        else if(ch=='/')
            return 2;
        else if(ch=='*')
            return 2;
        else if(ch=='%')
            return 2;
        else if(ch=='+')
            return 1;
        else
            return 1;
    }

    public static String popper(String postfix,char ch,Stack<Character> stack)
    {
        while( !stack.isEmpty() && stack.peek()!='(' && priority(stack.peek()) >= priority(ch))
            //if preference equal or less you will be removeed or ig your priority is equal or more that me you are removed
            postfix += stack.pop();

        stack.push(ch);

        return postfix;

    }
    public static String infixToPostfix(String exp) {

        Stack<Character> stack = new Stack<>();

        char ch ;
        String postfix = "";
        for(int i =0;i<=exp.length()-1;i++)
        {
            ch = exp.charAt(i);

            if(ch=='^'||ch=='/'||ch=='+'||ch=='-'||ch=='*'||ch=='%')
            {
                postfix = popper(postfix,ch,stack);
            }
            else if(ch=='(')
            {
                stack.push(ch);
            }
            else if (ch==')')

            {
                char temp = stack.pop();
                while(temp !='(')
                {
                    postfix+=temp;
                    temp =  stack.pop();
                }

            }
            else
                postfix+=ch;

        }

        while(!stack.isEmpty())
         postfix+=stack.pop();

        return postfix;

    }
    public static void main(String args[])
    {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";

        System.out.println(infixToPostfix(exp));
    }
}
