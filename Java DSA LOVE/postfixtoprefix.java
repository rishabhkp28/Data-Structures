import java.util.*;
public class postfixtoprefix {

    static String postToPre(String post_exp) {

        Stack<String> stack = new Stack<>();

        for (int i = 0; i <= post_exp.length() - 1; i++) {
            String ch = Character.toString(post_exp.charAt(i));

            if (ch.equals("/") || ch.equals("*") || ch.equals("^") || ch.equals("+") || ch.equals("-") || ch.equals("%")) {
                String top1 = stack.pop();
                String top2 = stack.pop();
                String ans = ch + top2 + top1;

                stack.push(ans);

            } else
                stack.push(ch);
        }

        return stack.pop();
    }
        public static void main(String[] args) {
            String post_exp = "AB+CD-*"; // Example postfix expression
            System.out.println("Prefix Expression: " + postToPre(post_exp));
        }
}
